package com.kiswire.mariatomongobatch.util;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;

@Data
public class CustomPickedTime {
	private Timestamp startTs;
	private Timestamp endTs;
	
	// 0 : 오눌 날짜
	// 1 : 어제 날짜
	// 2: 2틀전 날짜
	public static CustomPickedTime getStartEndTs(int minusDay) {
		LocalDateTime startTime = LocalDateTime.of(LocalDate.now().minusDays(minusDay), LocalTime.of(0, 0, 0));
		LocalDateTime endTime = LocalDateTime.of(LocalDate.now().minusDays(minusDay), LocalTime.of(23, 59, 59));
		
        // 싱글톤으로 사용하면 더 좋다.
		CustomPickedTime c = new CustomPickedTime();
		c.startTs = Timestamp.valueOf(startTime);
		c.endTs = Timestamp.valueOf(endTime);
		
		return c;
	}
}