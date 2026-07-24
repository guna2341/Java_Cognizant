package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("""
            SELECT c
            FROM Country c
            WHERE LOWER(c.coName) LIKE LOWER(CONCAT('%', :keyword, '%'))
            OR LOWER(c.coCode) LIKE LOWER(CONCAT('%', :keyword, '%'))
            """)
    List<Country> searchCountries(@Param("keyword") String keyword);
}
