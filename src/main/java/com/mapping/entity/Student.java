package com.mapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "stdtab")  // one to many  and many to one  relation
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   int sid;

    private  String sname ;


    @OneToMany(mappedBy = "student",cascade =CascadeType.ALL)
    private List<Book> book;

    // one student has many book



}

