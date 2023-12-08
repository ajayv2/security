package com.security.service;

import com.security.models.Book;
import com.security.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;
    public BookService(){

    }

    public List<Book> getAllBook(){
        return bookRepo.findAll();
    }

    public Book getBookById(int id){
        Optional<Book> byId = bookRepo.findById(id);
        return byId.get();
    }

    public Book addBook(Book book){
        bookRepo.save(book);
        return book;
    }

    public Book updateBook(int id, Book book){
        Book book1 = bookRepo.findById(id).get();
        book1.setName(book.getName());
        book1.setAuthor(book.getAuthor());
        bookRepo.save(book1);
        return book1;
    }
}
