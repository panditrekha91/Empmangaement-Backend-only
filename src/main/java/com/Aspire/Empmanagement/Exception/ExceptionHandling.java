package com.Aspire.Empmanagement.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String ,String> exceptinHandle(MethodArgumentNotValidException ex)
	{
		
		Map <String ,String> map=new HashMap();
		
		ex.getBindingResult().getAllErrors().forEach(s ->{
			
			String name=((FieldError) s).getField();
			String message=s.getDefaultMessage();
			map.put(name, message);
		});
		
		return map;
		
		
	}
	
		
		
	
	
	
}
