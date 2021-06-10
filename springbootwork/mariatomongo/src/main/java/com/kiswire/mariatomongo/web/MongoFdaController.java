package com.kiswire.mariatomongo.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiswire.mariatomongo.nosql.domain.MongoFda001;
import com.kiswire.mariatomongo.nosql.domain.MongoFda001Repository;
import com.kiswire.mariatomongo.rdb.domain.Machine001;
import com.kiswire.mariatomongo.service.MongoFda001Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MongoFdaController {
	
	private final MongoFda001Repository mongoFda001Repository;
	private final MongoFda001Service MongoFda001Service;
	
	@PostMapping("/mongo/001")
	public String save() {
		MongoFda001 mf = new MongoFda001();
		mf.setId(1L);
		mf.setFda001R0037("data1");
		mf.setFda001R0038("data1");
		mf.setFda001R0039("data1");
		mf.setFda001R0040("data1");
		
		Machine001 mc = new Machine001();
		mc.setId(1L);
		mc.setName("온도센서머신");
		mc.setLoc("부산공장");
		mf.setMachineId(mc);
		
		mongoFda001Repository.save(mf);
		return "mongo save ok";
	}
	
	@GetMapping("/mongo/001")
	public List<MongoFda001> findAll() {
		return mongoFda001Repository.findAll();
	}
	
	@GetMapping("/mongo/001/machone/loc")
	public List<MongoFda001> findByMachineLoc() {
		return mongoFda001Repository.mFindMachineLoc("부산공장");
	}
	
	@GetMapping("/mongo/001/service/machone/loc")
	public List<MongoFda001> findByServiceMachineLoc() {
		return MongoFda001Service.mFindMachineLoc("부산공장");
	}
	
	@GetMapping("/mongo/001/service/machone/{id}")
	public List<MongoFda001> findByServiceMachineId(@PathVariable Long id) {
		return MongoFda001Service.mFindMachineId(id);
	}
}

