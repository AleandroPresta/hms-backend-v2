# Hotel Management System (HMS) Backend V2

## Overview

The Hotel Management System (HMS) Backend V2 is a Spring Boot application designed to manage hotel room bookings. It provides RESTful APIs for creating, updating, retrieving, and deleting hotel rooms and their associated bookings.

## Main Features

- **Room Management**:
  - Create new rooms with various attributes such as room name, type, capacity, location, images, features, price, and rating.
  - Retrieve details of all rooms or a specific room by ID.
  - Update room details.
  - Delete rooms and return the details of the deleted room.

- **Booking Management**:
  - Manage bookings associated with rooms.
  - Retrieve bookings for a specific room.

- **Welcome Messages**:
  - Provide welcome messages for the application and room sections.

## Technologies Used

- **Spring Boot**: Framework for building the application.
  - Spring Boot Starter Data JPA: For data persistence.
  - Spring Boot Starter Web: For building RESTful web services.
- **Hibernate**: ORM framework for database interactions.
- **MySQL**: Relational database for storing room and booking data.
- **Docker**: Containerization of the application.
- **Lombok**: Library to reduce boilerplate code for model classes.

## Project Structure

- **src/main/java/com/example/hms**:
  - **HmsApplication.java**: Main class to run the Spring Boot application.
  - **room**:
    - **RoomController.java**: REST controller for room-related endpoints.
    - **RoomService.java**: Service layer for room-related business logic.
    - **RoomRepository.java**: Repository interface for room data access.
    - **RoomEntity.java**: Entity class representing the room table in the database.
    - **RoomDto.java**: Data Transfer Object for room data.
  - **booking**:
    - **BookingEntity.java**: Entity class representing the booking table in the database.
  - **welcome**:
    - **WelcomeController.java**: REST controller for welcome messages.
  - **test**:
    - **TestRepository.java**: Repository interface for test data access.
    - **TestEntity.java**: Entity class representing the test table in the database.

- **src/main/resources**:
  - **application.properties**: Configuration file for database connection and other properties.

- **scripts**:
  - **create.sh**: Script to create new rooms using the REST API.
  - **update.sh**: Script to update room details using the REST API.

- **Dockerfile**: Dockerfile to build the Docker image for the application.

## Example API Endpoints

- **Room Management**:
  - `GET /api/v1/rooms/all`: Retrieve all rooms.
  - `GET /api/v1/rooms/{id}`: Retrieve a specific room by ID.
  - `POST /api/v1/rooms/create`: Create a new room.
  - `PUT /api/v1/rooms/{id}/update`: Update room details.
  - `DELETE /api/v1/rooms/{id}/delete`: Delete a room and return its details.

- **Welcome Messages**:
  - `GET /api/v1/welcome`: Retrieve a welcome message.
  - `GET /api/v1/rooms/welcome`: Retrieve a welcome message for the room section.

## Running the Application

1. **Build and Run with Maven**:
   ```sh
   ./mvnw package
   java -jar target/hms-0.0.1-SNAPSHOT.jar