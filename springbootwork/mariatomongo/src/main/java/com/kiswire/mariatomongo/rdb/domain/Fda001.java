package com.kiswire.mariatomongo.rdb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "FDA010")
public class Fda001 {
	// 필드 ~~
	private Long id;
	@Column(length = 20)
	private String FDA010_R0037;
	@Column(length = 20)
	private String FDA010_R0038;
	@Column(length = 20)
	private String FDA010_R0039;
	@Column(length = 20)
	private String FDA010_R0040;	
}
