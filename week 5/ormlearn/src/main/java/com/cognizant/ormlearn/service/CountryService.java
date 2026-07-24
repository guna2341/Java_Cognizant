package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import jakarta.transaction.Transactional;
import com.cognizant.ormlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.ormlearn.repository.CountryRepository;

import java.util.List;
import java.util.Optional;


@Service
public class CountryService {

    @Autowired
    CountryRepository repo;

    @Transactional
    public Country getCountryByCode(String code) throws CountryNotFoundException {
        Optional<Country> result = repo.findById(code);
        if (result.isEmpty()) {
            throw new CountryNotFoundException("Country with " + code + " not found.");
        }
        return result.get();
    }

    @Transactional
    public List<Country> searchCountries(String keyword) {
        return repo.searchCountries(keyword);
    }

    @Transactional
    public void addCountry(Country country) {
        if (repo.existsById(country.getCoCode())) {
            return;
        }
        repo.save(country);
    }

    @Transactional
    public Optional<Country> updateCountry(String coCode, String coName) {
        Optional<Country> existingCountry = repo.findById(coCode);
        if (existingCountry.isPresent()) {
            Country country = existingCountry.get();
            country.setCoName(coName);
            return Optional.of(repo.save(country));
        }

        return Optional.empty();
    }

    @Transactional
    public String deleteCountry(String coCode) {
        if (!repo.existsById(coCode)) {
            return "Country does not exist";
        }
        repo.deleteById(coCode);
        return "Country deleted successfully.";
    }

    @Transactional
    public List<Country> getAllCountries() {
        return repo.findAll();
    }

}
