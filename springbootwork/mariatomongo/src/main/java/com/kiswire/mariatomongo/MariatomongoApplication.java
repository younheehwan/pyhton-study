package com.kiswire.mariatomongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MariatomongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MariatomongoApplication.class, args);
	}

}
