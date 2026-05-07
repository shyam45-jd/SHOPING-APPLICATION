# SHOPING-APPLICATION
Shopping App is a Spring Boot based e-commerce backend application developed to manage online shopping operations. The application allows users to browse products, add items to cart, place orders, and manage customer information efficiently.

# 🛒 Shopping App

## 📌 Project Overview
Shopping App is a Spring Boot based e-commerce backend application developed to manage online shopping operations efficiently.  
The application allows users to browse products, add items to cart, place orders, and manage customer information digitally.

The project is designed using layered architecture with Controller, Service, Repository, and Entity layers.

---

# 🚀 Features

- ✅ User Registration & Login
- ✅ Product Management
- ✅ Add to Cart
- ✅ Order Management
- ✅ Payment Management
- ✅ REST API Development
- ✅ CRUD Operations
- ✅ MySQL Database Integration
- ✅ Layered Architecture

---

# 🛠 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- IntelliJ IDEA
- Postman
- Git & GitHub

---

# 📂 Project Structure

```text
src/main/java



⚙️ Database Configuration
application.properties
spring.application.name=shopping-app

spring.datasource.url=jdbc:mysql://localhost:3306/shopping_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
🗄 Create Database
CREATE DATABASE shopping_db;
▶️ Run the Project
Clone Repository
git clone https://github.com/shyam45-jd/SHOPPING-APP.git
Open Project

Open the project in IntelliJ IDEA.

Run Application

Run:

ShoppingAppApplication.java
📬 API Endpoints
Add Product
POST /products
Get All Products
GET /products
Update Product
PUT /products/{id}
Delete Product
DELETE /products/{id}
Add to Cart
POST /cart
Place Order
POST /orders
🧪 API Testing

Use Postman to test APIs.

Example JSON:

{
  "name": "Laptop",
  "price": 50000,
  "quantity": 2
}



│
├── controller
├── service
├── repository
├── entity
└── ShoppingAppApplication.java
