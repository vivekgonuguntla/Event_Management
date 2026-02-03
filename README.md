Event Management REST API – Spring Boot
A Spring Boot based RESTful web application for managing events. The application supports creating,
reading, updating, and deleting events and demonstrates best practices for REST API design, layered
architecture, validation, documentation, and testing

 ⚙️Features
Create Event
View All Events
View Event By ID
Update Event
Delete Event
Validation & Exception Handling
Swagger API Documentation
Unit & Controller Tests

⚙️ Tech Stack
Java 17
Spring Boot 3.2.5
Spring Web
Spring Data JPA
H2 Database
Lombok
Springdoc OpenAPI (Swagger)
JUnit 5 & Mockit

🅿️Project Structure
com.example.eventmanagement
├── controller
│   └── EventController.java
├── service
│   ├── EventService.java
│   └── EventServiceImpl.java
├── repository
│   └── EventRepository.java
├── model
│   └── Event.java
├── dto
│   └── EventRequest.java
├── exception
│   ├── ResourceNotFoundException.java
│   └── GlobalExceptionHandler.java
├── config
│   └── SwaggerConfig.java (optional)
└── EventManagementApplication.java
