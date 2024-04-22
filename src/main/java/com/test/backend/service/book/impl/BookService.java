package com.test.backend.service.book.impl;

import com.test.backend.commons.util.ConvertObjectUtil;
import com.test.backend.model.dto.BookDto;
import com.test.backend.model.entities.Book;
import com.test.backend.repository.book.impl.IBookRepositoryImpl;
import com.test.backend.service.book.IBookService;
import jakarta.transaction.SystemException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService implements IBookService {

    private final IBookRepositoryImpl iBookRepository;

    public BookService(IBookRepositoryImpl iBookRepository) {
        this.iBookRepository = iBookRepository;
    }


    @Override
    public BookDto createBook(BookDto bookDto) throws SystemException {

        bookDto.setState(true);

        var response = iBookRepository.save(ConvertObjectUtil.converterObject(bookDto, Book.class));
        if (response.isPresent()){
            return ConvertObjectUtil.converterObject(response.get(), BookDto.class);
        } else {
            throw new SystemException("Not possible create book");
        }
    }

    @Override
    public List<BookDto> getBooks() {

        List<Book> bookList = iBookRepository.getAllBooks();

        return bookList.stream()
                    .map(book -> ConvertObjectUtil.converterObject(book, BookDto.class))
                    .collect(Collectors.toList());

    }

    @Override
    public BookDto findBookById(Integer integer) throws SystemException {

        Optional<Book> book = iBookRepository.getBookById(integer);
        if (book.isPresent()){
            return ConvertObjectUtil.converterObject(book.get(), BookDto.class);
        }else {
            throw new SystemException("the book cannot be found");
        }

    }

    @Override
    public BookDto updateBook(BookDto bookDto) throws SystemException {
        var response = iBookRepository.updateBookById(ConvertObjectUtil.converterObject(bookDto, Book.class));
        if (response.isPresent()){
            return ConvertObjectUtil.converterObject(response.get(), BookDto.class);
        } else {
            throw new SystemException("Not possible update book");
        }
    }

    @Override
    public BookDto deleteBook(BookDto bookDto) throws SystemException {
        var response = iBookRepository.deleteBookById(ConvertObjectUtil.converterObject(bookDto, Book.class));
        if (response.isPresent()){
            return ConvertObjectUtil.converterObject(response.get(), BookDto.class);
        } else {
            throw new SystemException("Not possible update book");
        }
    }
}
