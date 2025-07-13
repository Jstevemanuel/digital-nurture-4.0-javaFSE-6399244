package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.cognizant.spring_learn.model.Country;

@SpringBootApplication
public class SpringLearnApplication {


	public static void main(String[] args) {
    	SpringApplication.run(SpringLearnApplication.class, args);
    }

}
