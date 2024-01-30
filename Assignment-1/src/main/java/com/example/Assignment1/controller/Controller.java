package com.example.Assignment1.controller;


import com.example.Assignment1.entity.Student;
import com.example.Assignment1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        return studentService.saveStudent(student);
    }

    // Retrieve all students
    @GetMapping("/allStudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Retrieve a student by ID
    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        return studentService.findById(studentId);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student updatedStudent) { return studentService.updateStudent(updatedStudent); }

    @DeleteMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        if (studentService.deleteStudentById(studentId)) {
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }

}
