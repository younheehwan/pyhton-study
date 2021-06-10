package com.kiswire.query.domain;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class Product {
	// 필드 ~~
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Integer price; // Integer는 int의 래핑 클래스
	
	@Transient // 데이터베이스에 컬럼을 만들지마
	private Integer level;
}
