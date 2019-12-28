package com.decathlon.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);    
	}

//	 @Override
//	    public void run(String...args) throws Exception {
//		 
//	     log.info("Nel Main!");
//	    }
}
