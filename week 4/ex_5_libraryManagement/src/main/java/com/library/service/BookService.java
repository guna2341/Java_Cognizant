package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public void getData() {
        System.out.println("Fetched data: " + repo.getData());
    }

    public void saveData() {
        System.out.println("Data saved: " + repo.saveData("Raw data"));
    }

}
