package com.kiswire.mariatomongo.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiswire.mariatomongo.nosql.domain.MongoFda001;
import com.kiswire.mariatomongo.nosql.domain.MongoFda001Repository;
import com.kiswire.mariatomongo.rdb.domain.Fda001;
import com.kiswire.mariatomongo.rdb.domain.Fda001Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MigrationMongoController {
	
	private final Fda001Repository fda001Repository;
	private final MongoFda001Repository mongoFda001Repository;
	
	@GetMapping("/maria/mongo")
	public List<Fda001> migration() {
		// 1. 마리아 DB 데이터 가져오기
		List<Fda001> datas = fda001Repository.findAll();
		
		// 2. Fda001 데잍터를 MongoFda001로 옮겨담기
		// map함수는 컬렉션을 순회하면서 한건씩 데이터를 리턴한는 함수
		List<MongoFda001> migDatas = datas.stream().map(
				(data)-> {
					// set함수(코드가 길어진다), 생성자(순서를 실수), 빌더패턴
					MongoFda001 m = MongoFda001.builder()
							.id(data.getId())
							.fda001R0037(data.getFda001R0037())
							.fda001R0038(data.getFda001R0038())
							.fda001R0039(data.getFda001R0039())
							.fda001R0040(data.getFda001R0040())
							.machineId(data.getMachineId())
							.build();
					return m;
					}
		).collect(Collectors.toList());
		
		mongoFda001Repository.saveAll(migDatas); // List<MongoFda001>
		return datas;
	}
}
