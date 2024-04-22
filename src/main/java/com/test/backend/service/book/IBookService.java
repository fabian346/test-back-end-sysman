package com.test.backend.service.book;

import com.test.backend.model.dto.BookDto;
import jakarta.transaction.SystemException;

import java.util.List;

public interface IBookService {

    BookDto createBook(BookDto bookDto) throws SystemException;

    List<BookDto> getBooks();

    BookDto findBookById(Integer integer) throws SystemException;

    BookDto updateBook(BookDto bookDto) throws SystemException;

    BookDto deleteBook(BookDto bookDto) throws SystemException;
}
