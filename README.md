# Spring Boot Item Management REST API

This is a simple Spring Boot backend application that implements a RESTful API for managing a collection of items (similar to basic e-commerce or movie catalog backend).

The project is built as part of a backend task to demonstrate Java, Spring Boot, REST API development, and in-memory data handling.

---

## 🚀 Features

- Add a new item
- Get item by ID
- In-memory data storage using ArrayList
- Input validation
- RESTful API architecture

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Maven
- REST API
- Postman / CURL (for testing)

---

## 📦 Item Model

Each item contains:

- id (Long)
- name (String)
- description (String)
- price (Double)

---

## 📡 API Endpoints

### 1️⃣ Add New Item

**POST** `/api/items`

Request Body (JSON):

```json
{
  "name": "iPhone 15",
  "description": "Apple Mobile Phone",
  "price": 79999
}
