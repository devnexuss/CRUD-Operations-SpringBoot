package com.example.Assignment1.service;

import com.example.Assignment1.entity.Student;
import com.example.Assignment1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save a new student
    public Student saveStudent(Student student) {
        // Delegate the save operation to the repository
        return studentRepository.save(student);
    }

    // Find a student by ID
    public Student findById(int id) {
        // Delegate the find operation to the repository
        return studentRepository.findById(id);
    }

    // Get a list of all students
    public List<Student> getAllStudents() {
        // Delegate the get all operation to the repository
        return studentRepository.getAllStudents();
    }

    // Update a student by ID
    public Student updateStudent(int id, Student updatedStudent) {
        // Delegate the update operation to the repository
        return studentRepository.update(id, updatedStudent);
    }

    // Delete a student by ID
    public boolean deleteStudentById(int id) {
        // Delegate the delete operation to the repository
        return studentRepository.deleteById(id);
    }
}
