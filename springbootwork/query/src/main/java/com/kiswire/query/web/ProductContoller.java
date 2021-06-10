package com.kiswire.query.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiswire.query.domain.Product;
import com.kiswire.query.domain.ProductDTO;
import com.kiswire.query.domain.ProductRepository;
import com.kiswire.query.service.ProductService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ProductContoller {
	
	private final ProductRepository productRepository;
	private final ProductService productService;
	
	@GetMapping("/product/test1")
	public Product test1() {
		return productRepository.mFindTest1(1L);
	}
	
	@GetMapping("/product/test2")
	public ProductDTO test2() {
		return productService.test1(1L);
	}
}
