package com.application.library.controller;

import com.application.library.data.Book;
import com.application.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    //CREATE
    @RequestMapping(method = RequestMethod.POST, value = "books")
    public ResponseEntity saveBook(@RequestBody Book book){
        return ResponseEntity.ok(bookRepository.save(book));
    }

    //READ
    @RequestMapping(method = RequestMethod.GET, value = "books")
    public ResponseEntity getAllBooks(){
        Iterable<Book> books = bookRepository.findAll();
        return ResponseEntity.ok(books);
    }

    //UPDATE

    //DELETE
}
