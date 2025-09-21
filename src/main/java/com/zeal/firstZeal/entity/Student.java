package com.zeal.firstZeal.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.Name;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name="student_Table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rollNO")
    private int rollNO;
    private String name;
    private String email;
    private String address;

    @ManyToOne
//    @JsonManagedReference
    @JsonBackReference
    Branch branch;


}

