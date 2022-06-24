package com.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext config = SpringApplication.run(SpringBootDemo1Application.class, args);
//		ComponentConfig comconfig= config.getBean(ComponentConfig.class);
//		System.out.println(comconfig.getMessage());
		SpringApplication.run(SpringBootDemoApplication.class, args);
		
	}

}
