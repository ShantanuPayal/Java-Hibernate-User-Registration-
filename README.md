# Hibernate User Registration System

## Overview
This project demonstrates a simple user registration system built using Hibernate, Servlets, and JSP (JavaServer Pages). It allows users to register, view registered users, and persist user data in a database.

## Features
- User registration with fields for name, address, email, login, and password.
- Viewing all registered users in a tabular format.
- Uses Hibernate for database interaction.

## Technologies Used
- Java
- Servlets
- JSP (JavaServer Pages)
- Hibernate
- HTML/CSS

## Setup
### Database Configuration:
- Configure your database connection details in the `hibernate.cfg.xml` file.
- Set up the necessary database tables to match the Register entity fields.

### Running the Application:
- Deploy the project on a servlet container (e.g., Apache Tomcat).
- Access the application using the appropriate URL.

## Usage
1. Access the `Home.jsp` page to navigate through the functionalities.
2. Click on "New User? Create Account" to register a new user.
3. Use the provided form in `Register.jsp` to input user details.
4. Click on "View all Registered Users" to see the list of registered users.

## Folder Structure
- `src`: Contains Java source files (servlets, entity classes).
- `WebContent`: Includes JSP files (UI) and configuration files.

## Contributing
Contributions are welcome! Fork the repository, make your changes, and submit a pull request.

