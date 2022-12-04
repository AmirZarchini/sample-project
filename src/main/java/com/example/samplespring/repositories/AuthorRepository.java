package com.example.samplespring.repositories;

import com.example.samplespring.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
