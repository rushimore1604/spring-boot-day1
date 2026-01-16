# Spring Boot Journey (Beginner to Advanced)

This repository contains my Spring Boot learning journey, built step by step as part of my daily coding practice — from basics to advanced concepts.

---

## Day 1 – Hello World

### What this project does
- Runs a Spring Boot application
- Exposes a basic REST API
- Returns a simple response in the browser

### API Endpoint
- **GET** `/`  
  → Returns: `Spring Boot is working!`

### How to Run
1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run the main Spring Boot application class
4. Open browser and visit:  
   http://localhost:8080

### Status
Learning project – **Day 1**

---

## Day 2 – REST API Expansion

### What this project does
- Adds multiple REST API endpoints
- Returns different responses from the server
- Shows application status and server time

### API Endpoints
- **GET** `/hello` → Greeting message
- **GET** `/status` → Application status
- **GET** `/time` → Current server time

### How to Run
1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run the main Spring Boot application class
4. Open browser and visit:
  - http://localhost:8080/hello
  - http://localhost:8080/status
  - http://localhost:8080/time

### Status
Learning project – **Day 2**

---

## Day 3 – POST API with JSON

### What this project does
- Accepts JSON data from the client
- Handles POST requests using Spring Boot
- Converts JSON request body into a Java object
- Returns a success response

### API Endpoint
- **POST** `/user` → Creates a user using JSON input

### Sample Request (JSON)
{
  "name": "Rushi",
  "age": 21
}

### Status
Learning project – **Day 3**

---

## Day 4 – JSON Response with DTO
### What this project does
- Returns structured JSON responses
- Uses DTO (Data Transfer Object) for clean API design
- Separates request and response models
- Improves maintainability and readability

### API Endpoint

- **POST** `/user` → 

### Sample Response (JSON)
{
"message": "User created successfully",
"name": "Rushi",
"age": 21
}

### Status
Learning project – **Day 4**

---

## Day 5 – Validation (Request Body Validation)

### What this project does
- Validates incoming JSON request data
- Prevents invalid user creation
- Returns clean validation errors

### API Endpoint
- POST `/user`

### Sample Invalid Request
{
  "name": "",
  "age": 0
}

### Status
Learning project – **Day 5**

---

### Tech Stack
- Java 17
- Spring Boot 3
- Maven

## License
- This project is licensed under the MIT License.

---