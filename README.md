# Java Full Stack Web Development Internship – Task 2

## Project Title
Modern Landing Page with Contact Form (Spring Boot + MySQL)

---

## Project Description
This project is a full-stack web application developed as part of the Java Full Stack Web Development Internship.

The frontend consists of a modern landing page with a contact form created using HTML and CSS.  
The backend is built using Java Spring Boot, and the contact form data is stored in a MySQL database using Spring Data JPA.

---

## Tech Stack
- HTML
- CSS
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## Features
- Modern landing page UI
- Contact form with Name, Email, and Message
- Spring Boot backend integration
- REST API using POST request
- Data stored in MySQL database
- JSON API to fetch all contacts
- Success message after form submission

---

## Project Structure
- `src/main/java/com/example/demo/`
  - `DemoApplication.java` – Spring Boot application entry point
  - `Contact.java` – Entity class mapped to database
  - `ContactRepository.java` – JPA Repository
  - `ContactController.java` – REST Controller

- `src/main/resources/static/`
  - `index.html` – Landing page
  - `contact.html` – Contact form page
  - `style.css` – Styling for the frontend
  - `script.js` – Client-side scripting
  - `easy-service.png` – Logo / image asset

- `src/main/resources/`
  - `application.properties` – Database configuration

- `pom.xml` – Maven dependencies and project configuration

---

## How to Run the Project
1. Clone the repository
2. Create MySQL database:
   ```sql
   CREATE DATABASE contactdb;
