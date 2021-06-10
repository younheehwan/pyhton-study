package com.kiswire.mariatomongo.rdb.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// long = 8Byte => 래핑 클래스 Long
public interface Fda001Repository extends JpaRepository<Fda001, Long>{
	
}
