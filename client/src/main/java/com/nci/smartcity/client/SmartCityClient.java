package com.nci.smartcity.client;

import com.formdev.flatlaf.FlatDarkLaf;
import com.nci.smartcity.*;
import com.nci.smartcity.discovery.*;
import com.nci.smartcity.discovery.client.DiscoveryClient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class SmartCityClient {
    private final DiscoveryClient discoveryClient;
    private final JFrame frame;
    private final JTabbedPane tabbedPane;

    // Service clients
    private TrafficServiceGrpc.TrafficServiceBlockingStub trafficStub;
    private PublicServiceGrpc.PublicServiceBlockingStub publicStub;
    private ParkingServiceGrpc.ParkingServiceBlockingStub parkingStub;

    // Streaming observers
    private StreamObserver<TrafficUpdate> trafficObserver;
    private StreamObserver<PublicServiceUpdate> serviceObserver;
    private StreamObserver<ParkingUpdate> parkingObserver;

    // GUI components
    private JTextArea trafficStatusArea;
    private JTextArea publicStatusArea;
    private JTextArea parkingStatusArea;
    private JTextArea eventLogArea;

    public SmartCityClient() {
        discoveryClient = new DiscoveryClient("localhost", 50051);

        // Setup UI
        FlatDarkLaf.setup();
        frame = new JFrame("Smart City Controller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);

        tabbedPane = new JTabbedPane();

        // Traffic Control Tab
        JPanel trafficPanel = createTrafficPanel();
        tabbedPane.addTab("Traffic Control", trafficPanel);

        // Public Services Tab
        JPanel publicPanel = createPublicPanel();
        tabbedPane.addTab("Public Services", publicPanel);

        // Parking Tab
        JPanel parkingPanel = createParkingPanel();
        tabbedPane.addTab("Parking", parkingPanel);

        // Event Log Tab
        eventLogArea = new JTextArea();
        eventLogArea.setEditable(false);
        JScrollPane eventLogScroll = new JScrollPane(eventLogArea);
        tabbedPane.addTab("Event Log", eventLogScroll);

        frame.add(tabbedPane);
        frame.setVisible(true);

        // Discover and connect to services
        discoverAndConnectServices();
    }

    private JPanel createTrafficPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        // Control inputs
        JPanel controlPanel = new JPanel(new GridLayout(3, 2));

        JComboBox<String> intersectionCombo = new JComboBox<>(
                new String[]{"intersection-1", "intersection-2", "intersection-3"});
        JButton getDataButton = new JButton("Get Traffic Data");

        JSpinner greenDurationSpinner = new JSpinner(new SpinnerNumberModel(30, 10, 90, 5));
        JSpinner redDurationSpinner = new JSpinner(new SpinnerNumberModel(30, 10, 90, 5));
        JButton adjustLightsButton = new JButton("Adjust Traffic Lights");

        getDataButton.addActionListener(e -> {
            String intersection = (String) intersectionCombo.getSelectedItem();
            getTrafficData(intersection);
        });

        adjustLightsButton.addActionListener(e -> {
            String intersection = (String) intersectionCombo.getSelectedItem();
            int green = (Integer) greenDurationSpinner.getValue();
            int red = (Integer) redDurationSpinner.getValue();
            adjustTrafficLights(intersection, green, red);
        });

        controlPanel.add(new JLabel("Intersection:"));
        controlPanel.add(intersectionCombo);
        controlPanel.add(getDataButton);
        controlPanel.add(new JLabel());
        controlPanel.add(new JLabel("Light Durations:"));
        JPanel lightPanel = new JPanel(new GridLayout(1, 3));
        lightPanel.add(new JLabel("Green:"));
        lightPanel.add(greenDurationSpinner);
        lightPanel.add(new JLabel("Red:"));
        lightPanel.add(redDurationSpinner);
        lightPanel.add(adjustLightsButton);
        controlPanel.add(lightPanel);

        // Status area
        trafficStatusArea = new JTextArea();
        trafficStatusArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(trafficStatusArea);

        // Start streaming button
        JButton streamButton = new JButton("Start Traffic Updates");
        streamButton.addActionListener(e -> {
            List<String> intersections = new ArrayList<>();
            intersections.add((String) intersectionCombo.getSelectedItem());
            startTrafficStream(intersections);
        });

        panel.add(controlPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(streamButton, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createPublicPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        // Control inputs
        JPanel controlPanel = new JPanel(new GridLayout(3, 2));

        JComboBox<String> serviceCombo = new JComboBox<>(
                new String[]{"water", "electricity", "waste"});
        JButton getStatusButton = new JButton("Get Service Status");

        JTextField issueTypeField = new JTextField("Leak");
        JTextField locationField = new JTextField("Main St");
        JButton reportButton = new JButton("Report Issue");

        getStatusButton.addActionListener(e -> {
            String service = (String) serviceCombo.getSelectedItem();
            getServiceStatus(service);
        });

        reportButton.addActionListener(e -> {
            String service = (String) serviceCombo.getSelectedItem();
            String issueType = issueTypeField.getText();
            String location = locationField.getText();
            reportIssue(issueType, location, service);
        });

        controlPanel.add(new JLabel("Service:"));
        controlPanel.add(serviceCombo);
        controlPanel.add(getStatusButton);
        controlPanel.add(new JLabel());
        controlPanel.add(new JLabel("Issue Details:"));
        JPanel issuePanel = new JPanel(new GridLayout(1, 3));
        issuePanel.add(new JLabel("Type:"));
        issuePanel.add(issueTypeField);
        issuePanel.add(new JLabel("Location:"));
        issuePanel.add(locationField);
        issuePanel.add(reportButton);
        controlPanel.add(issuePanel);

        // Status area
        publicStatusArea = new JTextArea();
        publicStatusArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(publicStatusArea);

        // Start streaming button
        JButton streamButton = new JButton("Start Service Updates");
        streamButton.addActionListener(e -> {
            List<String> services = new ArrayList<>();
            services.add((String) serviceCombo.getSelectedItem());
            startServiceUpdatesStream(services);
        });

        panel.add(controlPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(streamButton, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createParkingPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        // Control inputs
        JPanel controlPanel = new JPanel(new GridLayout(3, 2));

        JComboBox<String> areaCombo = new JComboBox<>(
                new String[]{"downtown", "mall"});
        JButton findParkingButton = new JButton("Find Available Parking");

        JTextField spotField = new JTextField("D1");
        JTextField userField = new JTextField("user123");
        JTextField plateField = new JTextField("ABC123");
        JSpinner durationSpinner = new JSpinner(new SpinnerNumberModel(60, 15, 240, 15));
        JButton reserveButton = new JButton("Reserve Parking");

        findParkingButton.addActionListener(e -> {
            String area = (String) areaCombo.getSelectedItem();
            findAvailableParking(area);
        });

        reserveButton.addActionListener(e -> {
            String area = (String) areaCombo.getSelectedItem();
            String spot = spotField.getText();
            String user = userField.getText();
            String plate = plateField.getText();
            int duration = (Integer) durationSpinner.getValue();
            reserveParking(spot, user, plate, duration);
        });

        controlPanel.add(new JLabel("Parking Area:"));
        controlPanel.add(areaCombo);
        controlPanel.add(findParkingButton);
        controlPanel.add(new JLabel());
        controlPanel.add(new JLabel("Reservation Details:"));
        JPanel reservePanel = new JPanel(new GridLayout(1, 5));
        reservePanel.add(new JLabel("Spot:"));
        reservePanel.add(spotField);
        reservePanel.add(new JLabel("User:"));
        reservePanel.add(userField);
        reservePanel.add(new JLabel("Plate:"));
        reservePanel.add(plateField);
        reservePanel.add(new JLabel("Duration:"));
        reservePanel.add(durationSpinner);
        reservePanel.add(reserveButton);
        controlPanel.add(reservePanel);

        // Status area
        parkingStatusArea = new JTextArea();
        parkingStatusArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(parkingStatusArea);

        // Start streaming button
        JButton streamButton = new JButton("Start Parking Updates");
        streamButton.addActionListener(e -> {
            String area = (String) areaCombo.getSelectedItem();
            startParkingUpdatesStream(area);
        });

        panel.add(controlPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(streamButton, BorderLayout.SOUTH);

        return panel;
    }

    private void discoverAndConnectServices() {
        try {
            // Discover services
            List<DiscoveryServiceInfo> services = discoveryClient.discoverAllServices();

            for (DiscoveryServiceInfo service : services) {
                ManagedChannel channel = ManagedChannelBuilder.forAddress(
                                service.getServiceAddress(), service.getServicePort())
                        .usePlaintext()
                        .build();

                switch (service.getServiceName()) {
                    case "TrafficService":
                        trafficStub = TrafficServiceGrpc.newBlockingStub(channel);
                        appendToLog("Connected to Traffic Service at " +
                                service.getServiceAddress() + ":" + service.getServicePort());
                        break;
                    case "PublicService":
                        publicStub = PublicServiceGrpc.newBlockingStub(channel);
                        appendToLog("Connected to Public Service at " +
                                service.getServiceAddress() + ":" + service.getServicePort());
                        break;
                    case "ParkingService":
                        parkingStub = ParkingServiceGrpc.newBlockingStub(channel);
                        appendToLog("Connected to Parking Service at " +
                                service.getServiceAddress() + ":" + service.getServicePort());
                        break;
                }
            }
        } catch (Exception e) {
            appendToLog("Error discovering services: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Traffic methods
    private void getTrafficData(String intersectionId) {
        if (trafficStub == null) {
            appendToLog("Traffic service not available");
            return;
        }

        TrafficRequest request = TrafficRequest.newBuilder()
                .setIntersectionId(intersectionId)
                .build();

        TrafficResponse response = trafficStub.getTrafficData(request);
        trafficStatusArea.setText("Traffic Data for " + intersectionId + ":\n");
        trafficStatusArea.append("Vehicle count: " + response.getVehicleCount() + "\n");
        trafficStatusArea.append("Average speed: " + String.format("%.1f", response.getAverageSpeed()) + " km/h\n");
        trafficStatusArea.append("Congestion level: " + response.getCongestionLevel() + "\n");
        appendToLog("Retrieved traffic data for " + intersectionId);
    }

    private void adjustTrafficLights(String intersectionId, int greenDuration, int redDuration) {
        if (trafficStub == null) {
            appendToLog("Traffic service not available");
            return;
        }

        TrafficLightRequest request = TrafficLightRequest.newBuilder()
                .setIntersectionId(intersectionId)
                .setGreenDuration(greenDuration)
                .setRedDuration(redDuration)
                .build();

        TrafficLightResponse response = trafficStub.adjustTrafficLights(request);
        trafficStatusArea.setText("Response: " + response.getMessage());
        appendToLog("Adjusted traffic lights at " + intersectionId + ": " + response.getMessage());
    }

    private void startTrafficStream(List<String> intersectionIds) {
        if (trafficStub == null) {
            appendToLog("Traffic service not available");
            return;
        }

        TrafficStreamRequest request = TrafficStreamRequest.newBuilder()
                .addAllIntersectionIds(intersectionIds)
                .build();

        TrafficServiceGrpc.TrafficServiceStub asyncStub = TrafficServiceGrpc.newStub(
                ((io.grpc.stub.AbstractStub<?>) trafficStub).getChannel());

        trafficObserver = new StreamObserver<TrafficUpdate>() {
            @Override
            public void onNext(TrafficUpdate update) {
                SwingUtilities.invokeLater(() -> {
                    trafficStatusArea.append("Traffic Update:\n");
                    trafficStatusArea.append("Intersection: " + update.getIntersectionId() + "\n");
                    trafficStatusArea.append("Vehicles: " + update.getVehicleCount() + "\n");
                    trafficStatusArea.append("Timestamp: " + update.getTimestamp() + "\n\n");
                    appendToLog("Traffic update for " + update.getIntersectionId());
                });
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> {
                    trafficStatusArea.append("Error in traffic stream: " + t.getMessage() + "\n");
                    appendToLog("Error in traffic stream: " + t.getMessage());
                });
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> {
                    trafficStatusArea.append("Traffic stream completed\n");
                    appendToLog("Traffic stream completed");
                });
            }
        };

        asyncStub.streamTrafficUpdates(request, trafficObserver);
        appendToLog("Started traffic updates stream");
    }

    // Public service methods
    private void getServiceStatus(String serviceType) {
        if (publicStub == null) {
            appendToLog("Public service not available");
            return;
        }

        PublicServiceRequest request = PublicServiceRequest.newBuilder()
                .setServiceType(serviceType)
                .build();

        PublicServiceStatus response = publicStub.getServiceStatus(request);
        publicStatusArea.setText("Service Status for " + serviceType + ":\n");
        publicStatusArea.append("Status: " + response.getStatus() + "\n");
        publicStatusArea.append("Response time: " + response.getResponseTime() + " minutes\n");
        appendToLog("Retrieved status for " + serviceType);
    }

    private void reportIssue(String issueType, String location, String serviceType) {
        if (publicStub == null) {
            appendToLog("Public service not available");
            return;
        }

        PublicIssueReport request = PublicIssueReport.newBuilder()
                .setIssueType(issueType)
                .setLocation(location)
                .setReporterId("GUI-Client")
                .build();

        PublicIssueResponse response = publicStub.reportIssue(request);
        publicStatusArea.setText("Issue Reported:\n");
        publicStatusArea.append("Ticket ID: " + response.getTicketId() + "\n");
        publicStatusArea.append("Status: " + response.getStatus() + "\n");
        publicStatusArea.append("Message: " + response.getMessage() + "\n");
        appendToLog("Reported issue for " + serviceType + ": " + issueType + " at " + location);
    }

    private void startServiceUpdatesStream(List<String> serviceTypes) {
        if (publicStub == null) {
            appendToLog("Public service not available");
            return;
        }

        PublicServiceStreamRequest request = PublicServiceStreamRequest.newBuilder()
                .addAllServiceTypes(serviceTypes)
                .build();

        PublicServiceGrpc.PublicServiceStub asyncStub = PublicServiceGrpc.newStub(
                ((io.grpc.stub.AbstractStub<?>) publicStub).getChannel());

        serviceObserver = new StreamObserver<PublicServiceUpdate>() {
            @Override
            public void onNext(PublicServiceUpdate update) {
                SwingUtilities.invokeLater(() -> {
                    publicStatusArea.append("Service Update:\n");
                    publicStatusArea.append("Service: " + update.getServiceType() + "\n");
                    publicStatusArea.append("Status: " + update.getStatus() + "\n");
                    publicStatusArea.append("Message: " + update.getUpdateMessage() + "\n");
                    publicStatusArea.append("Timestamp: " + update.getTimestamp() + "\n\n");
                    appendToLog("Service update for " + update.getServiceType());
                });
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> {
                    publicStatusArea.append("Error in service stream: " + t.getMessage() + "\n");
                    appendToLog("Error in service stream: " + t.getMessage());
                });
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> {
                    publicStatusArea.append("Service stream completed\n");
                    appendToLog("Service stream completed");
                });
            }
        };

        asyncStub.streamServiceUpdates(request, serviceObserver);
        appendToLog("Started service updates stream");
    }

    // Parking methods
    private void findAvailableParking(String areaId) {
        if (parkingStub == null) {
            appendToLog("Parking service not available");
            return;
        }

        ParkingRequest request = ParkingRequest.newBuilder()
                .setAreaId(areaId)
                .build();

        ParkingResponse response = parkingStub.findAvailableParking(request);
        parkingStatusArea.setText("Available Parking in " + areaId + ":\n");
        parkingStatusArea.append("Total available spots: " + response.getAvailableSpots() + "\n");

        for (com.nci.smartcity.ParkingSpot spot : response.getSpotsList()) {
            parkingStatusArea.append("\nSpot ID: " + spot.getSpotId());
            parkingStatusArea.append("\nLocation: " + spot.getLocation());
            parkingStatusArea.append("\nAvailable: " + (spot.getIsAvailable() ? "YES" : "NO") + "\n");
        }

        appendToLog("Found available parking in " + areaId);
    }

    private void reserveParking(String spotId, String userId, String vehiclePlate, int duration) {
        if (parkingStub == null) {
            appendToLog("Parking service not available");
            return;
        }

        ParkingReservation request = ParkingReservation.newBuilder()
                .setSpotId(spotId)
                .setUserId(userId)
                .setVehiclePlate(vehiclePlate)
                .setDurationMinutes(duration)
                .build();

        ParkingConfirmation response = parkingStub.reserveParking(request);
        parkingStatusArea.setText("Reservation Response:\n");
        parkingStatusArea.append("Success: " + response.getSuccess() + "\n");
        if (response.getSuccess()) {
            parkingStatusArea.append("Reservation ID: " + response.getReservationId() + "\n");
        }
        parkingStatusArea.append("Message: " + response.getMessage() + "\n");
        appendToLog("Parking reservation for spot " + spotId + ": " + response.getMessage());
    }

    private void startParkingUpdatesStream(String areaId) {
        if (parkingStub == null) {
            appendToLog("Parking service not available");
            return;
        }

        ParkingStreamRequest request = ParkingStreamRequest.newBuilder()
                .setAreaId(areaId)
                .build();

        ParkingServiceGrpc.ParkingServiceStub asyncStub = ParkingServiceGrpc.newStub(
                ((io.grpc.stub.AbstractStub<?>) parkingStub).getChannel());

        parkingObserver = new StreamObserver<ParkingUpdate>() {
            @Override
            public void onNext(ParkingUpdate update) {
                SwingUtilities.invokeLater(() -> {
                    parkingStatusArea.append("Parking Update:\n");
                    parkingStatusArea.append("Spot ID: " + update.getSpotId() + "\n");
                    parkingStatusArea.append("Available: " + (update.getIsAvailable() ? "YES" : "NO") + "\n");
                    parkingStatusArea.append("Timestamp: " + update.getTimestamp() + "\n\n");
                    appendToLog("Parking update for spot " + update.getSpotId());
                });
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> {
                    parkingStatusArea.append("Error in parking stream: " + t.getMessage() + "\n");
                    appendToLog("Error in parking stream: " + t.getMessage());
                });
            }

            @Override
            public void onCompleted() {
                SwingUtilities.invokeLater(() -> {
                    parkingStatusArea.append("Parking stream completed\n");
                    appendToLog("Parking stream completed");
                });
            }
        };

        asyncStub.streamParkingUpdates(request, parkingObserver);
        appendToLog("Started parking updates stream for area " + areaId);
    }

    private void appendToLog(String message) {
        eventLogArea.append(new Date() + ": " + message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SmartCityClient());
    }
}
