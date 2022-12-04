package com.example.samplespring.repositories;

import com.example.samplespring.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
