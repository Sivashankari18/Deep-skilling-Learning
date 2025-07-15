package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;



import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController

public class CountryController {
	
	  private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	  
	    @Autowired
	    private CountryService countryService;

	    @GetMapping("/countries/{code}")
	    public Country getCountry(@PathVariable String code) {
	        return countryService.getCountry(code);
	    }

	    @RequestMapping("/country")
	    public Country getCountryIndia() {
	        LOGGER.info("START - getCountryIndia()");
	        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	        Country country = context.getBean("country", Country.class);
	        LOGGER.debug("Returning Country: {}", country);
	        LOGGER.info("END - getCountryIndia()");
	        return country;
	    }

}
