package com.kiswire.mariatomongo.nosql.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MongoFda001Repository extends MongoRepository<MongoFda001, String> {
	
	// 간단한 find 쿼리만 여기서 작성!!
	//@Query("{'machineId.loc':'부산공장'}")
	@Query("{'machineId.loc'::#{#loc}}")
	List<MongoFda001> mFindMachineLoc(String loc);
}
