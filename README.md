# Employee-Management-System

📘 Project Description:
The Employee Management System is a full-stack web application designed to manage employee data efficiently within an organization. It allows administrators or HR personnel to create, read, update, and delete (CRUD) employee records with an intuitive interface and robust backend support.

The system provides features like employee list viewing, record sorting, pagination, data validation, and form-based submissions. It uses Spring Boot for the backend, JPA/Hibernate for ORM and database operations, and Thymeleaf for rendering dynamic HTML views.

🎯 Key Features:
🧾 List Employees: Display all employees in a table with sorting and pagination.

➕ Add Employee: Create new employee records using a form.

✏️ Update Employee: Edit existing employee data through a pre-filled form.

❌ Delete Employee: Remove an employee entry with a confirmation dialog.

🔎 Sorting & Pagination: Sort by first name, last name, or email, and navigate across pages.

✅ Form Validation: JavaScript-based input validation for required fields and email format.

📦 MVC Architecture: Clean separation of layers using Spring MVC.

🛠️ Technology Stack:
Layer	Technology
Frontend	HTML5, CSS3, Bootstrap 4, Thymeleaf
Backend	Java, Spring Boot, Spring MVC
ORM	JPA (Hibernate)
Database	MySQL or H2
Tools	Spring Initializr, Maven, IntelliJ/STS
Deployment	Localhost / Apache Tomcat (Optional)

🗂️ Project Structure:
css
Copy
Edit
src/
├── main/
│   ├── java/
│   │   └── com.example.ems/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       ├── templates/
│       │   ├── index.html
│       │   ├── new_employee.html
│       │   └── update_employee.html
│       └── application.properties
💡 How It Works:
The homepage displays a paginated list of employees.

Users can click "Add Employee" to fill out a form and submit it.

Each record has "Update" and "Delete" options.

Form data is validated on the client-side before submission.

Backend services process the data, persist it using JPA, and redirect to the updated list.
