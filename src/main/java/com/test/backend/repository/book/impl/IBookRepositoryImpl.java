package com.test.backend.repository.book.impl;

import com.test.backend.model.entities.Book;

import java.util.List;
import java.util.Optional;

public interface IBookRepositoryImpl {

    Optional<Book> save(Book request);

    List<Book> getAllBooks();

    Optional<Book> getBookById(Integer id);

    Optional<Book> updateBookById(Book book);

    Optional<Book> deleteBookById(Book book);
}
