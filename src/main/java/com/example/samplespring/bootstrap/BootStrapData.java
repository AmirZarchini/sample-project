package com.example.samplespring.bootstrap;

import com.example.samplespring.model.Author;
import com.example.samplespring.model.Book;
import com.example.samplespring.repositories.AuthorRepository;
import com.example.samplespring.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author = new Author("amir", "mando");
        Book book = new Book("book1", "boo1");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);

        System.out.println("------------------");
        System.out.println("count author: " + authorRepository.count());
        System.out.println("count book: " + bookRepository.count());

    }
}
