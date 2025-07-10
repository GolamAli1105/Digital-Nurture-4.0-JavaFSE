package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;

@Service
public class CountryService {
	public Country getCountry(String code) throws CountryNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList = context.getBean("countryList", List.class);

        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findAny()
                .orElseThrow(() -> new CountryNotFoundException("Country not found with code: " + code));
    }
}
