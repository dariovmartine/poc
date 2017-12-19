package com.directv.afe.email.api.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice  
@RestController
public class DefaultExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(DefaultExceptionHandler.class);
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({Exception.class})
	public ErrorMessage handleContratoNotFound(Exception e){
		logger.error(e.getMessage());
		ErrorMessage error = new ErrorMessage(e.getMessage());
		return error;
	}
}