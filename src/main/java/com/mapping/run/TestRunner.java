package com.mapping.run;

import com.mapping.entity.Book;
import com.mapping.entity.Student;
import com.mapping.repository.BookRepository;
import com.mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

Student student = new Student();

student.setSname("shaurabh");





 studentRepository.save(student);





Book book = new Book();

book.setBnamae("APJ Biography");


Book book1 = new Book();

book1.setBnamae("java book");


Book book2 = new Book();
book2.setBnamae("dsa book");


Book book3 = new Book();
book3.setBnamae("jdbc book");

book.setStudent(student);
book1.setStudent(student);
book2.setStudent(student);
book3.setStudent(student);


bookRepository.save(book);
bookRepository.save(book1);
bookRepository.save(book2);
bookRepository.save(book3);



 // second student akash

        Student student1 = new Student();
        student1.setSname("akash");
        studentRepository.save(student1);


        Book book4 = new Book();

        book4.setBnamae("APJ Biography");


        Book book5 = new Book();

        book5.setBnamae("java book");


        Book book6 = new Book();
        book6.setBnamae("dsa book");


        Book book7 = new Book();
        book7.setBnamae("jdbc book");

        book4.setStudent(student1);
        book5.setStudent(student1);
        book6.setStudent(student1);
        book7.setStudent(student1);

        bookRepository.save(book4);
        bookRepository.save(book5);
        bookRepository.save(book6);
        bookRepository.save(book7);







    }
}
