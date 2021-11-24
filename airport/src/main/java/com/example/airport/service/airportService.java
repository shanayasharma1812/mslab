package com.example.airport.service;

import com.example.airport.model.air;
import com.example.airport.repository.airportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class airportService {

    private final airportRepository airRepository;

    public airportService(airportRepository airRepository) {
        this.airRepository = airRepository;
    }

    public List<air> getAllBooks() {
        return airRepository.findAll();
    }

    public air getBook(String bookID) {
        return airRepository.findById(bookID).orElse(null);
    }


    public air create(air book) {
        return airRepository.save(book);
    }

    public void delete(String bookId) {
        airRepository.deleteById(bookId);
    }

    public air update(air book, String bookId) {
        air book1 = airRepository.findById(bookId).get();
        book1.setAuthor(book.getAuthor());
        book1.setPublisher(book.getPublisher());
        airRepository.save(book1);
        return book1;
    }

    public void deleteAll() {
        airRepository.deleteAll();
    }
}