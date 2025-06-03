# Product Service

## Description
This is a microservice responsible for managing product information as part of a microservices architecture. It's built using Spring Boot and includes Spring Data MongoDB and OpenAPI documentation.

## Technologies
* Java 21
* Spring Boot
* Spring Data MongoDB
* MongoDB Database
* Docker
* OpenAPI (Swagger) Documentation

## Getting Started

### Prerequisites
* JDK 21
* Docker and Docker Compose
* Maven

### Running the Application

1. **Start MongoDB**
   ```bash
   docker-compose up -d
   ```

2. **Build the Application**
   ```bash
   ./mvnw clean install
   ```

3. **Run the Application**
   ```bash
   ./mvnw spring-boot:run
   ```

The application will be available at `http://localhost:8080`

### API Documentation
Once the application is running, you can access the API documentation at:
* Swagger UI: `http://localhost:8080/swagger-ui.html`
* OpenAPI JSON: `http://localhost:8080/api-docs`

## API Endpoints

### Products
* `POST /api/products` - Create a new product
* `GET /api/products` - List all products

Example product creation request:
```json
{
  "name": "google pixel 9",
  "description": "google pixel 9",
  "price": 1000
}