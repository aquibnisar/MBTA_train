package com.train.mbta.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.train.mbta.dataLayer.ErrorMessage;

@RestControllerAdvice
public class MbtaExceptionHandler {

	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex)
	{
		ErrorMessage errorMessage=new ErrorMessage("404", ex.getMessage());
		return errorMessage;
	}
}
