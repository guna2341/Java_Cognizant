package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Starting Application");
	    formatDate();
		displayCountry();
		displayCountries();
		LOGGER.info("Ending Application");
	}

	public static void formatDate() {
		LOGGER.debug("Display format date");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat dateFormat = context.getBean("dateFormat", SimpleDateFormat.class);
		Date date = null;
		try {
			date = dateFormat.parse("31/12/2018");
		}
		catch (Exception e) {
			LOGGER.error("e: ", e);
		}
		LOGGER.debug(String.valueOf(date));
		LOGGER.debug("End");
	}

	public static void displayCountry() {
		LOGGER.debug("Display countries");
		ApplicationContext context = new ClassPathXmlApplicationContext("singleCountry.xml");
		Country country = context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("\nCountry={}", country);
		LOGGER.debug("End");
	}

	public static void displayCountries() {
		LOGGER.debug("Displaying arraylist of countries");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countries = (ArrayList<Country>) context.getBean("countryList", ArrayList.class);
		LOGGER.debug("\nCountries={}", countries);
		LOGGER.debug("End");
	}

}
