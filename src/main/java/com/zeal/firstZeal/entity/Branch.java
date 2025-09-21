package com.zeal.firstZeal.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
//    @JsonBackReference
//        @JsonManagedReference
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="branchId")
    private int branchId;
    @Column(name="branchName")
    private String branchName;

    @OneToMany(mappedBy = "branch" )
//    @JsonBackReference
            @JsonManagedReference
    List<Student> student;

}