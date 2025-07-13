package com.cognizant.orm_learn.CountryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.CountryRepository.CountryRepository;
import com.cognizant.orm_learn.model.Country;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}
	

}
