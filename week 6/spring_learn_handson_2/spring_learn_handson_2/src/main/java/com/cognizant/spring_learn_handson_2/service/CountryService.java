package com.cognizant.spring_learn_handson_2.service;

import com.cognizant.spring_learn_handson_2.exception.CountryNotFoundException;
import com.cognizant.spring_learn_handson_2.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {

    final ApplicationContext context;

    public CountryService() {
        context = new ClassPathXmlApplicationContext("country.xml");
    }

    public Country getCountryIndia() {
        return context.getBean("in", Country.class);
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Country> getAllCountries() {
        return (ArrayList<Country>) context.getBean("countryList", ArrayList.class);
    }

    @SuppressWarnings("unchecked")
    public Country getCountry(String code) {
        ArrayList<Country> countries = (ArrayList<Country>) context.getBean("countryList", ArrayList.class);
        for(Country c: countries) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        throw new CountryNotFoundException();
    }

}
