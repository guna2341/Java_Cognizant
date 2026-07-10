package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public String getData() {
        return "Actual data";
    }

    public boolean saveData(String data) {
        return true;
    }

}
