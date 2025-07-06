package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	
	private static CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	
	private static void getAllCountriesTest() throws CountryNotFoundException {
        LOGGER.info("Start");
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country:{}", country);
        LOGGER.info("End");
    }
	
	private static void testAddCountry() {
	    LOGGER.info("Start");
	    Country newCountry = new Country();
	    newCountry.setCo_code("TO");
	    newCountry.setCo_name("Tottenham");

	    countryService.addCountry(newCountry);

	    try {
	        Country country = countryService.findCountryByCode("TO");
	        LOGGER.debug("Added Country: {}", country);
	    } catch (CountryNotFoundException e) {
	        LOGGER.error("Exception: {}", e.getMessage());
	    }
	    LOGGER.info("End");
	}

	private static void testUpdateCountry() {
	    LOGGER.info("Start");
	    try {
	        countryService.updateCountry("TO", "Tottenham Updated");
	        Country updatedCountry = countryService.findCountryByCode("TO");
	        LOGGER.debug("Updated Country: {}", updatedCountry);
	    } catch (CountryNotFoundException e) {
	        LOGGER.error("Exception: {}", e.getMessage());
	    }
	    LOGGER.info("End");
	}
	
	private static void testDeleteCountry() {
	    LOGGER.info("Start");
	    countryService.deleteCountry("TO");
	    LOGGER.debug("Deleted Country with Code: TO");
	    LOGGER.info("End");
	}

	
	public static void main(String[] args) throws CountryNotFoundException {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		LOGGER.info("Inside main");
		getAllCountriesTest();
		testAddCountry();
		testUpdateCountry();
		testDeleteCountry();
	}

}
