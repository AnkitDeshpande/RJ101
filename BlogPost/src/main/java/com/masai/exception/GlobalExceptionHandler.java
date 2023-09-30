package com.masai.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(SomethingWentWrongException.class)
	public ResponseEntity<ErrorDetails> cust(SomethingWentWrongException ex, WebRequest req) {
		ErrorDetails ed = new ErrorDetails(req.getDescription(false), ex.getMessage(), LocalDate.now());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorDetails> cust(UserNotFoundException ex, WebRequest req) {
		ErrorDetails ed = new ErrorDetails(req.getDescription(false), ex.getMessage(), LocalDate.now());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.NOT_FOUND);
	}

}
