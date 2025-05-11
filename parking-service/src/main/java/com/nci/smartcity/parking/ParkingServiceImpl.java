package com.nci.smartcity.parking;

import com.nci.smartcity.*;
import io.grpc.stub.StreamObserver;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingServiceImpl extends ParkingServiceGrpc.ParkingServiceImplBase {
    private final Map<String, ParkingArea> areas = new HashMap<>();
    private final Map<String, ParkingReservation> reservations = new ConcurrentHashMap<>();
    private final Random random = new Random();

    public ParkingServiceImpl() {
        // Initialize parking areas
        ParkingArea downtown = new ParkingArea("downtown", "Downtown Parking");
        downtown.addSpot(new ParkingSpot("D1", "Level 1, Spot 1"));
        downtown.addSpot(new ParkingSpot("D2", "Level 1, Spot 2"));
        downtown.addSpot(new ParkingSpot("D3", "Level 2, Spot 1"));
        areas.put("downtown", downtown);

        ParkingArea mall = new ParkingArea("mall", "City Mall Parking");
        mall.addSpot(new ParkingSpot("M1", "North Entrance"));
        mall.addSpot(new ParkingSpot("M2", "South Entrance"));
        mall.addSpot(new ParkingSpot("M3", "East Entrance"));
        areas.put("mall", mall);
    }

    @Override
    public void findAvailableParking(ParkingRequest request, StreamObserver<ParkingResponse> responseObserver) {
        ParkingArea area = areas.get(request.getAreaId());

        if (area != null) {
            List<ParkingSpot> availableSpots = new ArrayList<>();
            for (ParkingSpot spot : area.getSpots()) {
                if (!isReserved(spot.getId())) {
                    availableSpots.add(spot);
                }
            }

            ParkingResponse.Builder responseBuilder = ParkingResponse.newBuilder()
                    .setAvailableSpots(availableSpots.size());

            for (ParkingSpot spot : availableSpots) {
                responseBuilder.addSpots(com.nci.smartcity.ParkingSpot.newBuilder()
                        .setSpotId(spot.getId())
                        .setIsAvailable(true)
                        .setLocation(spot.getLocation())
                        .build());
            }

            responseObserver.onNext(responseBuilder.build());
        } else {
            responseObserver.onError(new IllegalArgumentException("Parking area not found"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void reserveParking(ParkingReservation request, StreamObserver<ParkingConfirmation> responseObserver) {
        boolean spotFound = false;
        for (ParkingArea area : areas.values()) {
            for (ParkingSpot spot : area.getSpots()) {
                if (spot.getId().equals(request.getSpotId())) {
                    spotFound = true;
                    break;
                }
            }
        }

        if (!spotFound) {
            ParkingConfirmation response = ParkingConfirmation.newBuilder()
                    .setSuccess(false)
                    .setMessage("Parking spot not found")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }

        if (isReserved(request.getSpotId())) {
            ParkingConfirmation response = ParkingConfirmation.newBuilder()
                    .setSuccess(false)
                    .setMessage("Spot already reserved")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }

        String reservationId = "RES-" + System.currentTimeMillis();
        reservations.put(request.getSpotId(), request);

        ParkingConfirmation response = ParkingConfirmation.newBuilder()
                .setSuccess(true)
                .setReservationId(reservationId)
                .setMessage("Reservation confirmed for spot " + request.getSpotId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void streamParkingUpdates(ParkingStreamRequest request, StreamObserver<ParkingUpdate> responseObserver) {
        ParkingArea area = areas.get(request.getAreaId());
        if (area == null) {
            responseObserver.onError(new IllegalArgumentException("Parking area not found"));
            return;
        }

        AtomicInteger counter = new AtomicInteger(0);
        Runnable task = () -> {
            try {
                while (counter.getAndIncrement() < 15) {
                    for (ParkingSpot spot : area.getSpots()) {
                        // Simulate random availability changes
                        if (random.nextDouble() < 0.2) {
                            if (isReserved(spot.getId())) {
                                reservations.remove(spot.getId()); // Free the spot
                            } else {
                                // Randomly reserve the spot
                                ParkingReservation reservation = ParkingReservation.newBuilder()
                                        .setSpotId(spot.getId())
                                        .setUserId("user-" + random.nextInt(100))
                                        .setVehiclePlate("ABC" + (100 + random.nextInt(900)))
                                        .setDurationMinutes(30 + random.nextInt(120))
                                        .build();
                                reservations.put(spot.getId(), reservation);
                            }

                            ParkingUpdate update = ParkingUpdate.newBuilder()
                                    .setSpotId(spot.getId())
                                    .setIsAvailable(!isReserved(spot.getId()))
                                    .setTimestamp(String.valueOf(System.currentTimeMillis()))
                                    .build();

                            responseObserver.onNext(update);
                        }
                    }
                    Thread.sleep(2500);
                }
                responseObserver.onCompleted();
            } catch (InterruptedException e) {
                responseObserver.onError(e);
            }
        };
        new Thread(task).start();
    }

    private boolean isReserved(String spotId) {
        return reservations.containsKey(spotId);
    }

    private static class ParkingArea {
        private final String id;
        private final String name;
        private final List<ParkingSpot> spots = new ArrayList<>();

        public ParkingArea(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public void addSpot(ParkingSpot spot) {
            spots.add(spot);
        }

        public List<ParkingSpot> getSpots() {
            return spots;
        }
    }

    private static class ParkingSpot {
        private final String id;
        private final String location;

        public ParkingSpot(String id, String location) {
            this.id = id;
            this.location = location;
        }

        public String getId() {
            return id;
        }

        public String getLocation() {
            return location;
        }
    }
}
