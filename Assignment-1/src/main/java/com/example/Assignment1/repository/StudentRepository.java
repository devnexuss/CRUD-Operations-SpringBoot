package com.example.Assignment1.repository;

import com.example.Assignment1.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    // In-memory list to store students
    private final List<Student> list = new ArrayList<Student>();

    // Retrieve a list of students
    public List<Student> getAllStudents() {
        return list;
    }

    // Find a student by ID
    public Student findById(int id) {
        for(Student s: list) {
            if(s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Save a new student
    public Student save(Student student) {
        // Create a new student and add it to the list
        Student s = new Student();
        s.setId(student.getId());
        s.setName(student.getName());
        s.setGender(student.getGender());
        s.setAge(student.getAge());
        s.setCourse(student.getCourse());
        list.add(s);
        return s;
    }

    // Update a student by ID
    public Student update(int id, Student updatedStudent) {
        for (int i = 0; i < list.size(); i++) {
            Student existingStudent = list.get(i);
            if (existingStudent.getId() == id) {
                // Update the existing student with the new information
                existingStudent.setName(updatedStudent.getName());
                existingStudent.setGender(updatedStudent.getGender());
                existingStudent.setAge(updatedStudent.getAge());
                existingStudent.setCourse(updatedStudent.getCourse());
                return existingStudent;
            }
        }
        return null; // If the student with the given ID is not found
    }

    // Delete a student by ID
    public boolean deleteById(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                list.remove(s);
                return true; // Indicate that the deletion was successful
            }
        }
        return false; // If the student with the given ID is not found
    }
}
