package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmlearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmlearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmlearnApplication.class, args);
		addCountry();
		searchCountries();
		testGetAllCountries();
		getCountryByCode();
	}

	public static void addCountry() {
		ApplicationContext context = SpringApplication.run(OrmlearnApplication.class);
		countryService = context.getBean(CountryService.class);
		Country country = new Country("TS", "TestCountry");
		countryService.addCountry(country);
	}

	public static void getCountryByCode() {
		ApplicationContext context = SpringApplication.run(OrmlearnApplication.class);
		countryService = context.getBean(CountryService.class);
		LOGGER.info("Start");
		LOGGER.debug("Countries={}", countryService.getCountryByCode("TS"));
		LOGGER.info("End");
	}

	public static void searchCountries() {
		ApplicationContext context = SpringApplication.run(OrmlearnApplication.class);
		countryService = context.getBean(CountryService.class);
		LOGGER.info("Start");
		LOGGER.debug("Countries={}", countryService.searchCountries("ou"));
		LOGGER.info("End");
	}

	public static void testGetAllCountries() {
		ApplicationContext context = SpringApplication.run(OrmlearnApplication.class);
		countryService = context.getBean(CountryService.class);
		LOGGER.info("Start");
		LOGGER.debug("Countries={}", countryService.getAllCountries());
		LOGGER.info("End");
	}

}
