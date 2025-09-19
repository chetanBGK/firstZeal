package com.zeal.firstZeal.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.Name;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="branchId")
    private int branchId;
    @Column(name="branchName")
    private String branchName;

    @OneToMany(mappedBy = "branch" )
    List<Student> student;

}