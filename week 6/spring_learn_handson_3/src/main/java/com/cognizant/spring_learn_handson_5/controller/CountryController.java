package com.cognizant.spring_learn_handson_5.controller;

import com.cognizant.spring_learn_handson_5.model.Country;
import com.cognizant.spring_learn_handson_5.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public ArrayList getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/country")
    public Country getCountryIndia() {
        return countryService.getCountryIndia();
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }

}
