package com.example.samplespring.repositories;

import com.example.samplespring.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
