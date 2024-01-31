package com.example.Assignment1.controller;


import com.example.Assignment1.entity.Student;
import com.example.Assignment1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class Controller {

    @Autowired
    private StudentService studentService;

    // Create a new student
    @PostMapping("/createStudent")
    public Student createStudent (@RequestBody Student student) {
        // Call the service method to save the new student
        return studentService.saveStudent(student);
    }

    // Retrieve all students
    @GetMapping("/allStudents")
    public List<Student> getAllStudents() {
        // Call the service method to get a list of all students
        return studentService.getAllStudents();
    }

    // Retrieve a student by ID
    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        // Call the service method  to find and return a student by ID
        return studentService.findById(studentId);
    }

    // Update a student by ID
    @PutMapping("/updateStudent/{studentId}")
    public Student updateStudent(@PathVariable int studentId, @RequestBody Student updatedStudent) {
        // Call the service method to update the student with the provided ID
        return studentService.updateStudent(studentId, updatedStudent);
    }

    // Delete a student by ID
    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        // Check if the student with the given ID exists and delete it
        if (studentService.deleteStudentById(studentId)) {
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }
}
