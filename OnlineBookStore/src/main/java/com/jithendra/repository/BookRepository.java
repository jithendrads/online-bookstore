package com.jithendra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jithendra.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
