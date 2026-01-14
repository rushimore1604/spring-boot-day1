# Spring Boot Journey (Beginner to Advanced)

This repository contains my Spring Boot learning project created as part of my daily coding practice.

---

## Day 1 – Hello World

### What this project does
- Runs a Spring Boot application
- Exposes a basic REST API
- Returns a simple response from the browser

### API Endpoint
- GET `/` → returns: `Spring Boot is working!`

### How to Run
- Clone the repository
- Open the project in IntelliJ IDEA
- Run the main Spring Boot class
- Open browser and visit: http://localhost:8080

### Status
Learning project – Day 1

---

## Day 2 – REST API Expansion

### What this project does
- Adds multiple REST API endpoints
- Returns different responses from the server
- Shows application status and server time

### API Endpoints
- GET `/hello` → returns greeting message
- GET `/status` → returns application status
- GET `/time` → returns current server time

### How to Run
- Clone the repository
- Open the project in IntelliJ IDEA
- Run the main Spring Boot class
- Open browser and visit:
    - http://localhost:8080/hello
    - http://localhost:8080/status
    - http://localhost:8080/time

### Status
Learning project – Day 2

---

## Day 3 – POST API with JSON

### What this project does
- Accepts JSON data from the client
- Handles POST requests using Spring Boot
- Converts JSON request body into Java object
- Returns a success response from the server

### API Endpoint
- POST `/user` → creates a user using JSON data

### Sample Request (JSON)
```json
{
  "name": "Rushi",
  "age": 21
}

### Status
Learning project – Day 3

---

## Tech Stack
- Java 17
- Spring Boot 3
- Maven

---

## License
This project is licensed under the MIT License.
