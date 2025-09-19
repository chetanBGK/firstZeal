package com.zeal.firstZeal.serviceImpl;

import com.zeal.firstZeal.entity.Branch;
import com.zeal.firstZeal.entity.Student;
import com.zeal.firstZeal.exceptions.ResourceNotFoundException;
import com.zeal.firstZeal.repository.BranchRepo;
import com.zeal.firstZeal.repository.StudentRepository;
import com.zeal.firstZeal.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServices {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    BranchRepo branchRepo;
    @Override
    public Student createStudent(Student student
            ,int branchId) {
        Branch branch= branchRepo.findById(branchId).get();
        student.setBranch(branch);
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Student not found with id ", id));
    }

    @Override
    public Student updateStudent(Student student, int id) {
        Student existingStudent=
                studentRepository.findById(id).get();
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setEmail(student.getEmail());
        studentRepository.save(existingStudent);

        return existingStudent;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
