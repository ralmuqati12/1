package com.example.Watheq.ExceptionHandling;

import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ApiExceptionsHandler extends ResponseEntityExceptionHandler {

	   @ExceptionHandler(ApiBaseException.class)
	   public ResponseEntity<ExceptionDetails> handleApiExceptions(ApiBaseException ex, WebRequest request){
		   ExceptionDetails details = new ExceptionDetails(ex.getMessage(), request.getDescription(false));
	       return new ResponseEntity<>(details, ex.getStatusCode());
	   }

	   @Override
	   protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
	       ValidationError validationError = new ValidationError();
	       validationError.setUrl(request.getDescription(false));

	       List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();

	       for(FieldError f: fieldErrors) {
	           validationError.addError(f.getDefaultMessage());
	       }


	       return new ResponseEntity<>(validationError, HttpStatus.BAD_REQUEST);
	   }
	
}
