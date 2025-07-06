package com.cognizant.orm_learn.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
    
    @Transactional
    public void addCountry(Country country) {
    	countryRepository.save(country);
    }

    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException{
    	Optional<Country> result = countryRepository.findById(countryCode);
		if (!result.isPresent()) {
			throw new CountryNotFoundException("Country not found for code: " + countryCode);
		}
		return result.get();
	}
    
    @Transactional
    public void updateCountry(String countryCode, String newName) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found for code: " + countryCode);
        }
        Country country = result.get();
        country.setCo_name(newName);
        countryRepository.save(country);
    }
    
    @Transactional
    public void deleteCountry(String countryCode) {
        countryRepository.deleteById(countryCode);
    }

}
