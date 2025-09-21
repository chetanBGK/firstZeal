package com.zeal.firstZeal.controller;

import com.zeal.firstZeal.entity.Student;
import com.zeal.firstZeal.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("zeal")
public class ZealController {

    @Autowired
    StudentServices studentServices;
//    CRUD
//    Create, Retreieve, Update, Delete
    //@PostMapping, @GetMapping,@PutMapping,@DeleteMapping

    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello World!.....";
    }

    @GetMapping("saybye")
    public String sayBye(){
        return "Bye World!.....";
    }

    @GetMapping("add")
    public int add(){
        return 10+20;
    }

    @PostMapping("createstudent/{branchId}")
    public Student
    createStudent(@RequestBody Student student
            ,@PathVariable int branchId)
    {
        return studentServices
                .createStudent(student,branchId);
    }

    @GetMapping("getall")
    public ResponseEntity<List<Student>> getAllStudents()
    {
        return new ResponseEntity<>(studentServices.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("getbyid/{id}")
    public Student
    getStudentById(@PathVariable int id)
    {
        return studentServices.getStudentById(id);
    }

    @DeleteMapping("delete/{id}")
    String deleteStudent(@PathVariable int id){
        studentServices.deleteStudent(id);
        return "Student Deleted Successfully";
    }

    @PutMapping("update/{id}")
    Student updateStudent(@RequestBody Student student
            ,@PathVariable int id)
    {
        return studentServices.updateStudent(student,id);
    }

}
