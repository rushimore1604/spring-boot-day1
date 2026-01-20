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
```json
{
 "name": "Rushi",
 "age": 21 
}
```

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
```json
{
  "message": "User created successfully",
  "name": "Rushi",
  "age": 21
}
```

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
```json
{
  "name": "",
  "age": 0
}
```

### Status
Learning project – **Day 5**

---

## Day 6 – Service Layer Implementation

### What this project does
- Introduced Service Layer for clean architecture
- Controller now delegates logic to Service classes
- Improved maintainability and structure

### Status
Learning project – Day 6

---

## Day 7 – MySQL + JPA Integration

### What this project does
- Connected Spring Boot with MySQL database
- Created a `User` entity mapped to MySQL table
- Stored user data into MySQL using Spring Data JPA
- Verified database insert using MySQL Workbench

### API Endpoint
- **POST** `/user` → Saves user data into MySQL

### Sample Request (JSON)
```json
{
  "name": "Rushi",
  "age": 21 
}
```

### Sample Response (JSON)
```json
{
  "message": "User saved successfully with ID: 1",
  "name": "Rushi",
  "age": 21
}
```

### Database Table
- Table Name: users
- Database: springboot_journey 

### How to Verify in MySQL
- USE springboot_journey;
- SELECT * FROM users;

### Status
Learning project – Day 7

---

## Day 8 – CRUD APIs with MySQL

### What this project does
- Implemented full CRUD operations using Spring Boot + MySQL
- Added APIs to create, read, update, and delete users

### API Endpoints
- **POST** `/api/users`
- **GET** `/api/users`
- **GET** `/api/users/{id}`
- **PUT** `/api/users/{id}`
- **DELETE** `/api/users/{id}`

### Status
Learning project – **Day 8**

---

## Day 9 – Global Exception Handling (Professional API Errors)

### What this project does
- Added custom exception for user not found
- Implemented global error handling using `@RestControllerAdvice`
- Returns clean JSON error responses with HTTP status codes

### Example Error Response (User Not Found)
```json
{
  "status": 404,
  "error": "User Not Found",
  "message": "User not found with id: 999",
  "path": "/api/users/999"
}
```
### Status
Learning project – **Day 9**

---

### Tech Stack
- Java 17
- Spring Boot 3
- Maven

## License
- This project is licensed under the MIT License.

---