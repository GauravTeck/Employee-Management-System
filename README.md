# Employee Management System 

A RESTful Employee Management System developed using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

This project demonstrates how to build a backend application using layered architecture and perform CRUD operations on employee records.

##  Technologies Used

- Java 17
- Spring Boot 4.2.0
- Spring Data JPA
- Hibernate
- MySQL 8.0
- Maven
- REST APIs
- Postman
- IntelliJ IDEA

##  Features

- Add new employees
- Retrieve all employees
- Retrieve employee by ID
- Update employee details
- Delete employee records
- MySQL database integration
- Automatic ID generation using JPA

##  Project Architecture

The application follows a layered architecture:

1. **Controller Layer:** Handles HTTP requests and responses.
2. **Service Layer:** Contains business logic.
3. **Repository Layer:** Handles database operations using JpaRepository.
4. **Entity Layer:** Maps Java objects to database tables.

##  Database Structure

Database Name: `jpa_basic_emp`

Table Name: `employees`

| Column | Data Type |
|---|---|
| id | INT (Primary Key, Auto Increment) |
| name | VARCHAR(30) |
| email | VARCHAR(30) |
| department | VARCHAR(50) |
| salary | DOUBLE |

##  REST API Endpoints

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/employees` | Add a new employee |
| GET | `/employees` | Retrieve all employees |
| GET | `/employees/{id}` | Retrieve employee by ID |
| PUT | `/employees/{id}` | Update employee |
| DELETE | `/employees/{id}` | Delete employee |

##  How to Run the Project

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Create a MySQL database named `jpa_basic_emp`.
4. Configure your MySQL username and password in `application.properties`.
5. Run the Spring Boot application.
6. The application starts on port `8085`.
7. Test the REST APIs using Postman.

##  Key Learnings

Through this project, I gained practical experience in:

- Spring Boot application development.
- Spring Data JPA and Hibernate.
- Entity mapping using JPA annotations.
- CRUD operations using JpaRepository.
- Controller-Service-Repository architecture.
- MySQL database connectivity.
- REST API development and testing.

##  Author

Java Backend Developer | Learning and Building with Java & Spring Boot