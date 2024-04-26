package com.gl.rbawiththymeleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.rbawiththymeleaf.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	List<Book> findByNameContainsAndAuthorContainsAllIgnoreCase(String name, String author);

}
