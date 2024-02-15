package com.mapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "bktab")
public class Book { // parent entity

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int bid;
    private  String bname;

    @ManyToOne
    @JoinColumn(name  = "sidFK") // it will create another column as sidFK // it will join  primary key of  class student as a foreign key in  the table Book
    private Student student;



}






