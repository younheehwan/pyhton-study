package com.cos.spring.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice // 모든 예외가 모이는 컨트롤러가 된다.
@RestController
public class ExceptionController {
	
	// IllegalArgumentException 예외가 발생하면 해당 함수가 실행된다.
	@ExceptionHandler(CustomException.class)
	public String exception1(Exception e) { // 스프링이 예외사 발생히면
		return e.getMessage();
	}
}
