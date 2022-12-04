package com.example.samplespring.repositories;

import com.example.samplespring.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
