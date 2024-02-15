package com.mapping.run;

import com.mapping.entity.Book;
import com.mapping.entity.Student;
import com.mapping.repository.BookRepository;
import com.mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//
//Student student = new Student();
//
//student.setSname("shaurabh");
//
//
//
//
//
// studentRepository.save(student);
//
//
//
//
//
//Book book = new Book();
//
//book.setBnamae("APJ Biography");
//
//
//Book book1 = new Book();
//
//book1.setBnamae("java book");
//
//
//Book book2 = new Book();
//book2.setBnamae("dsa book");
//
//
//Book book3 = new Book();
//book3.setBnamae("jdbc book");
//
//book.setStudent(student);
//book1.setStudent(student);
//book2.setStudent(student);
//book3.setStudent(student);
//
//
//bookRepository.save(book);
//bookRepository.save(book1);
//bookRepository.save(book2);
//bookRepository.save(book3);
//
//
//
// // second student akash
//
//        Student student1 = new Student();
//        student1.setSname("akash");
//        studentRepository.save(student1);
//
//
//        Book book4 = new Book();
//
//        book4.setBnamae("APJ Biography");
//
//
//        Book book5 = new Book();
//
//        book5.setBnamae("java book");
//
//
//        Book book6 = new Book();
//        book6.setBnamae("dsa book");
//
//
//        Book book7 = new Book();
//        book7.setBnamae("jdbc book");
//
//        book4.setStudent(student1);
//        book5.setStudent(student1);
//        book6.setStudent(student1);
//        book7.setStudent(student1);
//
//        bookRepository.save(book4);
//        bookRepository.save(book5);
//        bookRepository.save(book6);
//        bookRepository.save(book7);
//
//

// mapping concept   best way
        // third  student pranit  final best


        Student student = new Student();
        student.setSname("pranit");

        studentRepository.save(student);  // save parent object

        Book book1= new Book();

        book1.setBname("Biography");  // set child object


        Book book2 = new Book();

        book2.setBname(" biology book");   // set child object


        Book book3= new Book();
        book3.setBname("maths book");  // set child object


        Book book4 = new Book();
        book4.setBname(" physics book");   // set child object




        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);


        student.setBook(books); //parent object.set (child object ) here it is (list of books)

        book1.setStudent(student);     // child object.set ( parent object )
        book2.setStudent(student);
        book3.setStudent(student);
        book4.setStudent(student);


   bookRepository.save(book1);
   bookRepository.save(book2);     // save child object to database
   bookRepository.save(book3);     // save child object to database
   bookRepository.save(book4);     // save child object to database






    }
}
