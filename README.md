# Bangalore Metro Route Finder Web Application

This is a Java Spring Boot web application for Bangalore Metro Route Finder. It allows users to select source and destination stations and displays the shortest path, fare, distance, and travel time.

## Features
- Select source and destination stations from a dropdown
- View shortest path, total stations, estimated distance, fare, and travel time
- Simple and clean web interface (Thymeleaf)

## How to Run
1. Make sure you have Java 17+ and Maven installed.
2. In the `web` directory, run:
   ```
   mvn spring-boot:run
   ```
3. Open your browser and go to [http://localhost:8080](http://localhost:8080)

## Integration
- The backend is ready to integrate with your existing Java metro logic (MetroMap, MetroLine, Station, MetroFeatures).
- Update `MetroController.java` to use your core logic for real route calculations.
