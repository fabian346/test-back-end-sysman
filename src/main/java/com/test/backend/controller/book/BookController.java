package com.test.backend.controller.book;

import com.test.backend.model.dto.BookDto;
import com.test.backend.service.book.IBookService;
import jakarta.transaction.SystemException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(value = "")
@CrossOrigin(origins = "*")
public class BookController {

    private final IBookService iBookService;

    public BookController(IBookService iBookService) {
        this.iBookService = iBookService;
    }

    @PostMapping(value = "/book")
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto) throws SystemException {

        var response = iBookService.createBook(bookDto);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "/book")
    public ResponseEntity<List<BookDto>> getAll(){
        List<BookDto> bookDtos = iBookService.getBooks();
        if (bookDtos.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay libros disponibles");
        } else {
            return ResponseEntity.ok(bookDtos);
        }
    }

    @GetMapping(value = "/book/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable("id") Integer id) throws SystemException {
        BookDto bookDto = iBookService.findBookById(id);
        return ResponseEntity.ok(bookDto);
    }

    @PutMapping(value = "/book/{id}")
    public ResponseEntity<BookDto> updateBookById(@PathVariable("id") Integer id, @RequestBody BookDto bookDto) throws SystemException {

        bookDto.setId(Long.valueOf(id));

        var response = iBookService.updateBook(bookDto);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping(value = "/book/{id}")
    public ResponseEntity<BookDto> deleteBookById(@PathVariable("id") Integer id) throws SystemException {

        BookDto bookDto = new BookDto();
        bookDto.setId(Long.valueOf(id));
        bookDto.setState(false);
        var response = iBookService.deleteBook(bookDto);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
