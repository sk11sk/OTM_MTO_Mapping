package com.mapping;

import com.mapping.entity.Book;
import com.mapping.entity.Student;
import com.mapping.repository.BookRepository;
import com.mapping.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MappingApplicationTests {
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private StudentRepository studentRepository;
	@Test
	void contextLoads() {
	}















//	@Test
//	public void  getData() {
//
//		List<Student> all = studentRepository.findAll();
//		for (Student s : all) {
//			System.out.println(s.getSid());
//			System.out.println(s.getSname());
//
//
//		}
//
//
//
//
//
//		}






















//	@Test
//	public void getDataBook () {
//
//		Book book = bookRepository.findById(1).get();
//		System.out.println(book.getBid());
//		System.out.println(book.getBnamae());
//
////		for (Book s : bookList) {
////			System.out.println(s.getBid());
////			System.out.println(s.getBnamae());
////
////		}
//
//	}


	}