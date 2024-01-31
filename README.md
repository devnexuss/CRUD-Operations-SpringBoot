# Spring Boot CRUD Operations

This proect demonstrates the implementation of CRUD (Create, Read, Update, Delete) operations for a single entity using Spring Boot and Java.

## Features

- Create: Add new data to the system.
- Read: Retrieve information about existing data.
- Update: Modify the details of an existing data entry.
- Delete: Remove a data entry from the system.

## Usage

The server will start on http://localhost:3000.

Perform CRUD operations using the following endpoints:
1. Create: POST http://localhost:3000/students/createStudent
2. Read All: GET http://localhost:3000/students/allStudents
3. Read by ID: GET http://localhost:3000/students/{studentId}
4. Update: PUT http://localhost:3000/students/updateStudent/{studentId}
5. Delete: DELETE http://localhost:3000/students/deleteStudent/{studentId}

