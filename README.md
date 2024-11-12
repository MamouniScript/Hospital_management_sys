
# Hospital Management System - Microservices with Spring Cloud

## Overview
This project is a hospital management system developed using Spring Cloud microservices. The goal is to create a modular, scalable system that efficiently manages patients, doctors, and appointments within a hospital.

Each service operates independently, allowing for ease of scaling, flexibility in deployment, and clear separation of concerns.

## Table of Contents
1. [Architecture](#architecture)
2. [Getting Started](#getting-started)
3. [Microservices Overview](#microservices-overview)
4. [Technology Stack](#technology-stack)
5. [Running the Project](#running-the-project)
6. [API Endpoints](#api-endpoints)
7. [Future Improvements](#future-improvements)

## Architecture
This project follows a microservices architecture, using Spring Cloud for service discovery and configuration. The system includes three main services:
- **Patient Service**: Manages patient information.
- **Doctor Service**: Manages doctor information.
- **Appointment Service**: Manages appointment scheduling between patients and doctors.

## Getting Started
### Prerequisites
- Java 17 or higher
- Maven
- Docker (optional for containerization)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/hospital-management-microservices.git
   ```
2. Navigate to the project directory:
   ```bash
   cd hospital-management-microservices
   ```
3. Use Maven to build each service:
   ```bash
   mvn clean install
   ```

## Microservices Overview

### Patient Service
- **Description**: Manages all patient-related information.
- **Entities**: Patient (ID, name, age, address, contact).
- **Main Features**: CRUD operations for patients.

### Doctor Service
- **Description**: Manages all doctor-related information.
- **Entities**: Doctor (ID, name, specialty, contact).
- **Main Features**: CRUD operations for doctors.

### Appointment Service
- **Description**: Manages patient-doctor appointments.
- **Entities**: Appointment (ID, patient ID, doctor ID, date, time).
- **Main Features**: CRUD operations for appointments.

## Technology Stack
- **Spring Boot** for creating each microservice
- **Spring Cloud** for microservices infrastructure (Eureka, Feign, etc.)
- **H2 Database** for in-memory storage
- **Spring Data JPA** for data management
- **Spring Security + JWT** for securing APIs
- **Docker** for containerization

## Running the Project
1. Start the Eureka server for service discovery.
2. Run each microservice:
   ```bash
   mvn spring-boot:run
   ```
3. Alternatively, run services using Docker Compose:
   ```bash
   docker-compose up
   ```

## API Endpoints

### Patient Service
- `GET /patients` - Retrieve all patients.
- `POST /patients` - Add a new patient.
- `GET /patients/{id}` - Retrieve a patient by ID.
- `PUT /patients/{id}` - Update patient details.
- `DELETE /patients/{id}` - Remove a patient.

### Doctor Service
- `GET /doctors` - Retrieve all doctors.
- `POST /doctors` - Add a new doctor.
- `GET /doctors/{id}` - Retrieve a doctor by ID.
- `PUT /doctors/{id}` - Update doctor details.
- `DELETE /doctors/{id}` - Remove a doctor.

### Appointment Service
- `GET /appointments` - Retrieve all appointments.
- `POST /appointments` - Schedule a new appointment.
- `GET /appointments/{id}` - Retrieve an appointment by ID.
- `PUT /appointments/{id}` - Update an appointment.
- `DELETE /appointments/{id}` - Cancel an appointment.

## Future Improvements
- Integrate a PostgreSQL or MySQL database for persistent data storage.
- Implement role-based access control with Spring Security.
- Add logging and monitoring for better debugging and maintenance.

## License
This project is licensed under FREE License.
```
