# Employee Management REST API
## Spring Boot | Spring Data JPA | MySQL

A backend RESTful API built using **Spring Boot** to manage employee data.  
This project implements **basic CRUD operations** on employee records and connects to a **MySQL database** using **Spring Data JPA**.

---

## 🚀 Features

- Create, Read, Update, Delete employees  
- RESTful API design  
- Layered architecture (Controller, Service, Repository)  
- MySQL database integration  
- JPA & Hibernate for ORM  
- Auto table creation using Hibernate  
- Tested using Postman  

---

## 🧱 Project Structure

```
src/main/java/com/employee/management/api
│
├── controller
│   └── EmployeeController.java
│
├── service
│   └── EmployeeService.java
│
├── repository
│   └── EmployeeRepository.java
│
├── entity
│   └── Employee.java
│
└── EmployeeManagementApiApplication.java
```

---

## 🔧 Technologies Used

- Java 21  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- MySQL  
- Maven  
- Embedded Tomcat  

---

## 📡 API Endpoints

### ➕ Create Employee
```
POST /api/employees
```

### 📄 Get All Employees
```
GET /api/employees
```

### 🔍 Get Employee by ID
```
GET /api/employees/{id}
```

### ✏️ Update Employee
```
PUT /api/employees/{id}
```

### 🗑️ Delete Employee
```
DELETE /api/employees/{id}
```

---

## 📦 Sample JSON Request Body

```json
{
  "name": "John Doe",
  "age": 25,
  "department": "IT",
  "salary": 45000
}
```

---

## 🗄️ Database Configuration

Update `application.properties` with your MySQL details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db1
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

---

## ▶️ How to Run the Project

1. Clone the repository  
2. Open the project in **Spring Tool Suite (STS)** or **IntelliJ IDEA**  
3. Configure MySQL credentials  
4. Run `EmployeeManagementApiApplication.java`  
5. Application runs at:

```
http://localhost:8080
```

---

## 📝 Notes

- This is a **backend-only** project  
- Focused on understanding **Spring Boot REST APIs**  
- APIs tested using **Postman**  
- Suitable for **fresher-level backend practice**  

---

## 🚧 Future Enhancements

- Add global exception handling  
- Add Swagger / OpenAPI documentation  
- Input validation  
- Authentication & Authorization  
- Pagination and sorting  

---

## 👩‍💻 Author

**Ramya Sai Tirumalasetty**  
Java & Spring Boot Learner | Backend Development  
