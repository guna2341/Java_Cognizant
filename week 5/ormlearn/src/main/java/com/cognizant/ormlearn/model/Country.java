package com.cognizant.ormlearn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    private String coCode;
    private String coName;

    public Country() {}

    public Country(String coCode, String coName) {
        this.coCode = coCode;
        this.coName = coName;
    }

    @Id
    @Column(name = "co_code")
    public String getCoCode() {
        return coCode;
    }

    public void setCoCode(String coCode) {
        this.coCode = coCode;
    }

    @Column(name = "co_name")
    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    @Override
    public String toString(){
        return "Country code: " + this.coCode + " Country name: " + this.coName;
    }

}
