# Smart City Project 🏙️


A distributed smart city management system with gRPC communication, service discovery, and JavaFX GUI.

## Features ✨

- **Service Discovery**: Automatic registration and discovery of city services
- **gRPC Communication**: Efficient service-to-service communication
- **Three Core Services**:
    - 🚦 Traffic Service - Manages road traffic data
    - 🅿️ Parking Service - Handles parking spot availability
    - 💡 Public Service - Controls public utilities
- **JavaFX GUI**: Visual interface for monitoring and control
- **Security**: JWT authentication for service communication
- **Logging**: Comprehensive logging with Log4j2

## Architecture 🏗️

smart-city-project/
├── discovery-server/ # Service registry and discovery
├── traffic-service/ # Traffic management
├── parking-service/ # Parking management
├── public-service/ # Public utilities
├── client/ # JavaFX GUI controller
└── proto/ # gRPC protocol definitions

## Prerequisites 📋

- Java 17+
- Maven 3.8+
- Protocol Buffer Compiler (protoc)

## Installation & Setup ⚙️

1. Clone the repository:
   ```bash
   git clone https://github.com/Lukoonly/smart-city-project.git
   cd smart-city-project

2. Generate gRPC code:

mvn compile

Running the System 🚀

1. Start the Discovery Server:

cd discovery-server
mvn exec:java -Dexec.mainClass="com.nci.smartcity.discovery.DiscoveryServer"

2. Start the Services (in separate terminals):
# Traffic Service
cd traffic-service
mvn exec:java

# Parking Service
cd parking-service
mvn exec:java

# Public Service
cd public-service
mvn exec:java

3.Launch the GUI Client:
cd client
mvn javafx:run
