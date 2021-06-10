package com.kiswire.query.domain;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
	
	private BigInteger id;
	private String name;
	private Integer price;
	private Integer level;
}
