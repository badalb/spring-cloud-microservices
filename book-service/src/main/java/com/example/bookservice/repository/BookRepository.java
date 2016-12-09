package com.example.bookservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bookservice.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
