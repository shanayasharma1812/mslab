package com.example.airport.controller;

import com.example.airport.model.air;
import com.example.airport.service.airportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class airportController {
    private final airportService bookService;

    public airportController(airportService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getAllBooks")
    public List<air> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/get/{bookID}")
    public air getBook(@PathVariable String bookID) {
        return bookService.getBook(bookID);
    }

    @PostMapping("/createBook")
    public air createBook(@RequestBody air book) {
        return bookService.create(book);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable String bookId) {
        bookService.delete(bookId);
        return "Employee Deleted";
    }

    @PutMapping("/updateBook/{bookId}")
    public air updateBook(@RequestBody air book, @PathVariable String bookId) {
        return bookService.update(book, bookId);
    }

    @DeleteMapping("/deleteAll")
    public String deleteBooks() {
        bookService.deleteAll();
        return "All Emplyees data deleted";
    }
}