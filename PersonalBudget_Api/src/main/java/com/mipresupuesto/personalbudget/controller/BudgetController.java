package com.mipresupuesto.personalbudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mipresupuesto.personalbudget.application.command.interfaces.CreateBudgetPort;
import com.mipresupuesto.personalbudget.controller.response.Response;
import com.mipresupuesto.personalbudget.controller.response.dto.Message;
import com.mipresupuesto.personalbudget.dto.BudgetDTO;

@RestController
@RequestMapping("api/v1/budget")
public class BudgetController {
	
		@Autowired
	private reateBudgetPort createBudgetPort;
	
	
	@PostMapping
	public ResponseEntity<Response<BudgetDTO>> Create(@RequestBody BudgetDTO budget) {
		final Response<BudgetDTO> response = new Response<>();
		HttpStatus statusCode = HttpStatus.OK;
		
		try {
			createBudgetPort.execute(budget);
			response .addMessage(Message.createSuccessMessage("El budget se ha creado de forma satisfactioria "));
		} catch (final Exception exception ) {
			statusCode = HttpStatus.BAD_REQUEST;
			//si exception tiene mensaje de usuario , agrego el mensaje de usuario, sino ,
			//agrego un mensaje generico 
			response.addMessage(Message.createErrorMessage){
				"ha ocurrido un problema inesperado tratando de crear el presupuesto deseado... ";
			}	
		}
		createBudgetPort.execute(budget);
		return budget;
	}  

	@GetMapping
	public String saludar() {
		return "hola mundo";
	}
}
