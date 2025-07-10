package com.cognizant.spring_learn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryNotFoundException;
import com.cognizant.spring_learn.service.CountryService;

@RestController
public class CountryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	private CountryService countryService;
	
	@RequestMapping("/country")
	public Country getCountryIndia() {
        LOGGER.info("START(getCountryIndia)");

        // Load country bean from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        LOGGER.info("END(getCountryIndia");
        return country;
    }
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
	    LOGGER.info("START");

	    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	    List<Country> countryList = context.getBean("countryList", List.class);

	    LOGGER.info("END");
	    return countryList;
	}
	
	@GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        LOGGER.info("START(getCountry)");

        Country country = countryService.getCountry(code);

        LOGGER.info("END(getCountry)");
        return country;
    }
}
