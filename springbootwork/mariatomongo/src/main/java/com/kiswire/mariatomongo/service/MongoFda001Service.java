package com.kiswire.mariatomongo.service;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kiswire.mariatomongo.nosql.domain.MongoFda001;

import lombok.RequiredArgsConstructor;

 // MongoFda001Service (IoC 해야함 - 메모리) @Component, @RestController, @Repository(생략가능), @Service
@Service // 트랜잭션 시작 - 트랜잭션 종료. IoC 됨
@RequiredArgsConstructor
public class MongoFda001Service {
	
	//IoC에 MongoTemplate 클래스가 이미 로드가 되어있음.
	private final MongoTemplate mongoTemplate;
	
	//복잡한 쿼리를 작성하기 위한 함수 만들기
	@Transactional  //리프리카셋 세팅이 안되어 있기 때문에!!
	public List<MongoFda001> mFindMachineLoc(String loc){
		//Criteria 란 -> 문자열이 아닌 함수를 통해서 쿼리할 수 있게 해주는 라이브러리
		Criteria c = Criteria.where("machineId.loc").is(loc);
		Query query = new Query(c);
		return mongoTemplate.find(query, MongoFda001.class);
	}
	
	@Transactional  //리프리카셋 세팅이 안되어 있기 때문에!!
	public List<MongoFda001> mFindMachineId(Long id){
		//Criteria 란 -> 문자열이 아닌 함수를 통해서 쿼리할 수 있게 해주는 라이브러리
		Criteria c = Criteria.where("machineId.id").is(id);
		Query query = new Query(c);
		return mongoTemplate.find(query, MongoFda001.class);
	}
}
