package com.zeal.firstZeal.services;

import com.zeal.firstZeal.entity.Student;

import java.util.List;

public interface StudentServices {
    Student createStudent(Student student,int branchId);

//    List<Student> createAllSTudents(List<Student> students);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student updateStudent(Student student, int id);
    void deleteStudent(int id);
}
