package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.BookModel;

public interface BookRepo extends JpaRepository<BookModel, Integer>{

}
