package com.cos.spring.test;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Animal {
	private	String name = "동물";
	private	String color = "하얀색";
}
