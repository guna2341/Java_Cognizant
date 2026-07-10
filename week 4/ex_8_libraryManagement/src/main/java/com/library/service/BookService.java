package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public void getData() {
        System.out.println("Fetched data: " + repo.getData());
    }

    public void saveData() {
        System.out.println("Data saved: " + repo.saveData("Raw data"));
    }

}
