# 📌 Todo Web App

A simple, full-stack Todo Web Application built with Spring Boot, Spring Data JPA, MySQL, Maven, Bootstrap, and Thymeleaf.

This project demonstrates how to build a complete CRUD web app with a responsive UI, RESTful APIs, and a relational database backend.
🚀 Features

* ✅ Add new tasks
* ✅ View all tasks
* ✅ Edit and update tasks
* ✅ Delete tasks
* ✅ Mark tasks as complete/incomplete
* ✅ Responsive design with Bootstrap
# ⚙️ Tech Stack

  Backend: Spring Boot, Spring Data JPA, Maven

  Database: MySQL

  Frontend: HTML, Thymeleaf, Bootstrap

# 📂 Project Structure
```css
src/main/java/com/yourapp
 ├── controller
 │    └── TaskController.java
 ├── model
 │    └── Task.java
 ├── repository
 │    └── TaskRepository.java
 ├── service
 │    ├── TaskService.java
 │    └── TaskServiceImpl.java
 └── Application.java (Main class)

src/main/resources/
 ├── templates/
 │    └── tasks.html
 ├── application.properties
```
# 🗄️ Database Setup

  Install MySQL and create a database:

CREATE DATABASE todo-app;

Update your application.properties:
```java
spring.application.name=Todo-App

spring.datasource.url=jdbc:mysql://localhost:3306/todo-app
spring.datasource.username=root
spring.datasource.password={$your password}
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```
# ▶️ How to Run

 Clone the repository:

git clone https://github.com/Baseer-S/TODO-app.git
cd TODO-app

Build the project with Maven:

mvn clean install

Run the application:

mvn spring-boot:run

Open your browser and go to:

   http://localhost:8080/tasks

📸 Screenshots
![Screenshot 2025-07-01 at 20-19-15 Todo Application](https://github.com/user-attachments/assets/62df4052-719d-4bc2-819d-1f1072cbe69c)


🤝 Contributing

Pull requests are welcome! If you’d like to suggest improvements, feel free to fork the repo and submit a PR.
📜 License

This project is for learning purposes.
📧 Contact: [linkedIn](https://www.linkedin.com/in/baseer-s-419713285/).

If you have any suggestions or feedback, connect with me on LinkedIn.
