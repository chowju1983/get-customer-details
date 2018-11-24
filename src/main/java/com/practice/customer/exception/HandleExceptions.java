package com.practice.customer.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleExceptions {
	
	@Autowired
	private ExceptionVO exceptionBean;
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<ExceptionVO> handleResourceNotFoundException(Exception ex) {
		System.out.println("**********************************Inside HandleExceptions");
		exceptionBean.setMessage(ex.getMessage());
		exceptionBean.setErrorCode(HttpStatus.NOT_FOUND.toString());
		exceptionBean.setDescription("Incorrect Name");
		ResponseEntity re = new ResponseEntity<ExceptionVO>(exceptionBean,HttpStatus.NOT_FOUND);
		return re;
	}

}
