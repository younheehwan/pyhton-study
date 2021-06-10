package com.kiswire.mariatomongobatch.domain.maria.fda002;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MariaFda002Repository extends JpaRepository<MariaFda002, Long>{
	//SELECT * FROM fda001 WHERE PlcR0001Timestamp BETWEEN :startTime AND :endTime
	List<MariaFda002> findByPlcR0001TimestampBetween(Timestamp startTime, Timestamp endTime);
	List<MariaFda002> findByPlcR0001TimestampBetween(Timestamp startTime, Timestamp endTime, Pageable pageable);
}
