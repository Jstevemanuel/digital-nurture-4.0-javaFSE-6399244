package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

    public Country getCountry(String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList = List.of(
                (Country) context.getBean("countryIndia"),
                (Country) context.getBean("countryUSA")
        );

        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))  // Case-insensitive matching
                .findFirst()
                .orElse(null); 
    }
}
