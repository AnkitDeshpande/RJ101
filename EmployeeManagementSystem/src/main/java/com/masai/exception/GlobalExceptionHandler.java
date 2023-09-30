package com.masai.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(DuplicateResourceException.class)
	public ResponseEntity<ErrorDetails> cust(DuplicateResourceException ex, WebRequest req) {
		ErrorDetails ed = new ErrorDetails(req.getDescription(false), ex.getMessage(), LocalDate.now());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InternalServerErrorException.class)
	public ResponseEntity<ErrorDetails> cust(InternalServerErrorException ex, WebRequest req) {
		ErrorDetails ed = new ErrorDetails(req.getDescription(false), ex.getMessage(), LocalDate.now());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> cust(ResourceNotFoundException ex, WebRequest req) {
		ErrorDetails ed = new ErrorDetails(req.getDescription(false), ex.getMessage(), LocalDate.now());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.CONFLICT);
	}

	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<ErrorDetails> cust(UnauthorizedException ex, WebRequest req) {
		ErrorDetails ed = new ErrorDetails(req.getDescription(false), ex.getMessage(), LocalDate.now());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.UNAUTHORIZED);
	}

	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ErrorDetails> cust(ValidationException ex, WebRequest req) {
		ErrorDetails ed = new ErrorDetails(req.getDescription(false), ex.getMessage(), LocalDate.now());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.BAD_REQUEST);
	}

}
