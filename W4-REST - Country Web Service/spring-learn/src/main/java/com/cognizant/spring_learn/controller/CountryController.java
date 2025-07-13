package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Controller
public class CountryController {

    @RequestMapping("/country")
    @ResponseBody
    public Country getCountryIndia() {
        // Initialize the Spring context and retrieve the 'countryIndia' bean
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Country india = (Country) context.getBean("countryIndia");
        
        return india;
    }
}
