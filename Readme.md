# Client Management System

## Overview

A comprehensive Java-based desktop application for managing client/student information, attendance, and academic records. Built with Swing GUI framework and Maven for dependency management.

## Features

- **User Authentication**: Login and registration system for secure access
- **Student Management**: Add, view, update, and delete student records
- **Faculty Management**: Manage teacher/faculty information
- **Academic Records**: Track marks, grades, and performance
- **Check-in System**: Attendance and check-in functionality
- **Data Management**: CRUD operations for multiple entities

## Project Structure

```
src/main/java/
├── GUI Forms (.form files)
│   ├── Login.java/form - User authentication
│   ├── Register.java/form - User registration
│   ├── Student.java/form - Student management
│   ├── Teacher.java/form - Faculty management
│   ├── AddStudent.java/form - Add new student
│   ├── AddMarks.java/form - Record student marks
│   ├── ShowAll*.java/form - Display records
│   └── UpdateDelete.java/form - Modify records
├── Database Components
│   ├── Insert.java - Insert operations
│   ├── Insert2.java - Insert operations (variant)
│   └── DataFetch.java - Retrieve data
├── Utility Classes
│   ├── Fact.java/Factorial*.java - Factorial calculations
│   ├── PassFail.java - Grade evaluation
│   └── Demo.java, Ex*.java - Examples
└── com.mycompany.mavenproject1/
    └── Mavenproject1.java - Main entry point
```

## Technologies Used

- **Language**: Java
- **GUI Framework**: Java Swing
- **Build Tool**: Maven
- **Database**: Database operations via JDBC/custom insert classes

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6 or higher

### Building the Project

```bash
mvn clean install
```

### Running the Application

```bash
mvn exec:java -Dexec.mainClass="com.mycompany.mavenproject1.Mavenproject1"
```

## Usage

1. Launch the application
2. Register for a new account or login with existing credentials
3. Use the dashboard to manage student information, marks, and attendance
4. View all records through the various display forms
5. Update or delete records as needed

## File Organization

- **Forms**: GUI components created with NetBeans Form Designer (.form files)
- **Java Classes**: Logic implementation for each feature
- **pom.xml**: Maven configuration and dependencies

## Future Enhancements

- Database backend integration (MySQL/PostgreSQL)
- Enhanced reporting features
- Data export functionality
- Role-based access control
- Mobile application version
