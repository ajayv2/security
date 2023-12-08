package com.security.controller;

import com.security.models.Book;
import com.security.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    @PreAuthorize("hasRole('NORMAL')")
    public List<Book> getAllBook(){
        System.out.println("getall method");
        return bookService.getAllBook();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('NORMAL')")
    public Book getSignleBook(@PathVariable  int id){

        return bookService.getBookById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Book addBook(@RequestBody Book book){
        System.out.println("add method");
        return bookService.addBook(book);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Book updateBook(@PathVariable int id,@RequestBody Book book){
        System.out.println("update method");
        return bookService.updateBook(id,book);
    }
}
