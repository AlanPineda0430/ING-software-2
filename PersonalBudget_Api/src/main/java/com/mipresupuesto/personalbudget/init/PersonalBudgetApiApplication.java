package com.mipresupuesto.personalbudget.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= { "com.mipresupuesto.personal")
public class PersonalBudgetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalBudgetApiApplication.class, args);
	}

}
