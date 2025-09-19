package com.zeal.firstZeal.repository;

import com.zeal.firstZeal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
        extends JpaRepository<Student,Integer> {
}
