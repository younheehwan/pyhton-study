package com.kiswire.mariatomongo.batch;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kiswire.mariatomongo.nosql.domain.MongoFda001;
import com.kiswire.mariatomongo.nosql.domain.MongoFda001Repository;
import com.kiswire.mariatomongo.rdb.domain.Fda001;
import com.kiswire.mariatomongo.rdb.domain.Fda001Repository;
import com.kiswire.mariatomongo.rdb.domain.Machine001;

import lombok.RequiredArgsConstructor;

// Service, RestController, Repository, Component
@RequiredArgsConstructor
@Component
public class MoveData {
	
	private final Fda001Repository fda001Repository;
	private final MongoFda001Repository mongoFda001Repository;
	
	//@Scheduled(fixedDelay = 1000)
	public void test() {
		String now = LocalDateTime.now().toString();
		System.out.println("현재시간 : " + now);
	}
	
	// 초, 분, 시간, 일, 월, 주
	@Scheduled(cron = "0 30 15 * * *", zone = "Asia/Seoul") // Cron(OS내장) - 정기적 실행 - Daemon(서버-계속 실행)
	public void test2() {
		String now = LocalDateTime.now().toString();
		System.out.println("현재시간 : " + now);
	}
	
	// 초, 분, 시간, 일, 월, 주
	@Scheduled(cron = "0 38 15 * * *", zone = "Asia/Seoul") // Cron(OS내장) - 정기적 실행 - Daemon(서버-계속 실행)
	public void test3() {
		Fda001 fda001 = fda001Repository.findById(1L).get();
		System.out.println(fda001);
	}
	
	// 초, 분, 시간, 일, 월, 주
	@Scheduled(cron = "0 47 15 * * *", zone = "Asia/Seoul") // Cron(OS내장) - 정기적 실행 - Daemon(서버-계속 실행)
	public void test4() {
		Fda001 fda001 = fda001Repository.findById(1L).get();
		
//		MongoFda001 mFda001 = new MongoFda001();
//		mFda001.setId(fda001.getId());
//		mFda001.setFda001R0037(fda001.getFda001R0037());
//		mFda001.setFda001R0038(fda001.getFda001R0038());
//		mFda001.setFda001R0039(fda001.getFda001R0039());
//		mFda001.setFda001R0040(fda001.getFda001R0040());
//		mFda001.setMachineId(fda001.getMachineId());
//		mongoFda001Repository.save(mFda001);
		// 강사님 작성 로직
		MongoFda001 m = MongoFda001.builder()
				.id(fda001.getId())
				.fda001R0037(fda001.getFda001R0037())
				.fda001R0038(fda001.getFda001R0038())
				.fda001R0039(fda001.getFda001R0039())
				.fda001R0040(fda001.getFda001R0040())
				.machineId(fda001.getMachineId())
				.build()
		mongoFda001Repository.save(m);
		
	}
}
