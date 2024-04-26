package com.gl.rbawiththymeleaf.service;

import java.util.List;

import com.gl.rbawiththymeleaf.entity.Book;

public interface BookServices {
	
	public List<Book> findAll();

	public Book findById(int theId);

	public void save(Book theBook);

	public void deleteById(int theId);

	public List<Book> searchBy(String name, String author);


}
