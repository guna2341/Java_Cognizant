package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    final private BookRepository repo1;

    private BookRepository repo2;

    public BookService(BookRepository repo) {
        this.repo1 = repo;
    }

    public void setRepo2(BookRepository repo) {
        this.repo2 = repo;
    }

    public void getData1() {
        System.out.println("Fetched data from repo 1: " + repo1.getData());
    }

    public void saveData1() {
        System.out.println("Data saved from repo 1: " + repo1.saveData("Raw data"));
    }

    public void getData2() {
        System.out.println("Fetched data from repo 2: " + repo2.getData());
    }

    public void saveData2() {
        System.out.println("Data saved from repo 2: " + repo2.saveData("Raw data"));
    }

}
