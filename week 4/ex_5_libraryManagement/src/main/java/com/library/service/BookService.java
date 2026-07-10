package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repo;

    public void setRepo(BookRepository repo) {
        this.repo = repo;
    }

    public void getData() {
        System.out.println("Fetched data: " + repo.getData());
    }

    public void saveData() {
        System.out.println("Data saved: " + repo.saveData("Raw data"));
    }

}
