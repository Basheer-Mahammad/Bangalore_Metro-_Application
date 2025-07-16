
# Bangalore Metro Route Finder Web Application

This is a modern Java Spring Boot web application for Bangalore (Namma) Metro Route Finder. It helps users find the shortest route, fare, distance, and travel time between any two operational metro stations in Bangalore.

## Features
- Select source and destination stations from a searchable dropdown (all operational stations included)
- View the shortest path, total stations, estimated distance (in km/meters), fare, and travel time
- Responsive and attractive web interface using Thymeleaf and Bootstrap
- Ready for integration with optimized core metro logic (Dijkstra’s algorithm, OOP structure)

## How to Run
1. Make sure you have **Java 17+** and **Maven** installed.
2. In the `web` directory, run:
   ```
   mvn spring-boot:run
   ```
3. Open your browser and go to [http://localhost:8083](http://localhost:8083)

## Project Structure
- `src/main/java/com/metro/web/MetroController.java`: Spring Boot controller, handles web requests and integrates with core logic
- `src/main/resources/templates/index.html`: Thymeleaf template for the main UI (Bootstrap styled)
- `src/main/resources/static/index.html`: (Optional) Static landing page
- `pom.xml`: Maven dependencies (Spring Boot, Thymeleaf, Bootstrap)

## Integration
- The backend is ready to integrate with your optimized Java metro logic (MetroMap, MetroLine, Station, MetroFeatures, etc.)
- Update `MetroController.java` to use your core logic for real route calculations (currently uses dummy logic for demo)

## Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License.
