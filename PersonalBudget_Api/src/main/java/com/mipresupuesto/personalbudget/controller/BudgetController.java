package com.mipresupuesto.personalbudget.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {
	
	@PostMapping
	public BudgetDTO Create(@RequestBody BudgetDTO budget) {
		return budget;
	}  

}
