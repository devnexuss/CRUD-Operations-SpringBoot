package com.example.Assignment1.repository;

import com.example.Assignment1.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private final List<Student> list = new ArrayList<Student>();

    public List<Student> getAllStudents() {
        return list;
    }

    public Student findById(int id) {
        for(Student s: list) {
            if(s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public Student save(Student student) {
        Student s = new Student();
        s.setId(student.getId());
        s.setName(student.getName());
        s.setGender(student.getGender());
        s.setAge(student.getAge());
        s.setCourse(student.getCourse());
        list.add(s);
        return s;
    }

    public Student update(Student updatedStudent) {
        for (int i = 0; i < list.size(); i++) {
            Student existingStudent = list.get(i);
            if (existingStudent.getId() == updatedStudent.getId()) {
                // Update the existing student with the new information
                existingStudent.setName(updatedStudent.getName());
                existingStudent.setGender(updatedStudent.getGender());
                existingStudent.setAge(updatedStudent.getAge());
                existingStudent.setCourse(updatedStudent.getCourse());
                return existingStudent;
            }
        }
        return null;
    }

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
