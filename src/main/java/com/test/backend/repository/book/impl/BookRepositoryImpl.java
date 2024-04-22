package com.test.backend.repository.book.impl;

import com.test.backend.model.entities.Book;
import com.test.backend.repository.book.IBookRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookRepositoryImpl implements IBookRepositoryImpl {

    private final IBookRepository bookRepository;

    public BookRepositoryImpl(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> save(Book request) {
        return Optional.of(bookRepository.save(request));
    }

    @Override
    public List<Book> getAllBooks() {

        List<Book> bookList = bookRepository.findAll();

        return bookList;
    }

    @Override
    public Optional<Book> getBookById(Integer id) {
        return bookRepository.findById(Long.valueOf(id));
    }

    @Override
    public Optional<Book> updateBookById(Book request) {
        return Optional.of(bookRepository.save(request));
    }

    @Override
    public Optional<Book> deleteBookById(Book book) {
        return Optional.of(bookRepository.save(book));
    }
}
