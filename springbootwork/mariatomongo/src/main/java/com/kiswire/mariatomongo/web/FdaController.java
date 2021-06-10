package com.kiswire.mariatomongo.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiswire.mariatomongo.rdb.domain.Fda001;
import com.kiswire.mariatomongo.rdb.domain.Fda001Repository;
import com.kiswire.mariatomongo.rdb.domain.Machine001;
import com.kiswire.mariatomongo.rdb.domain.Machine001Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class FdaController {
	
	private final Fda001Repository fda001Repository;
	private final Machine001Repository machine001Repository;
	
	@PostMapping("/001")
	public String save() {
		Machine001 machine = machine001Repository.findById(1L).get();
		
		for(int i=0; i<1000;i++) {
			Fda001 f = new Fda001();
			
			f.setFda001R0037("data"+i);
			f.setFda001R0038("data"+i);
			f.setFda001R0039("data"+i);
			f.setFda001R0040("data"+i);
			f.setMachineId(machine);
			fda001Repository.save(f);
		}
		
		return "ok";
	}
	
	@GetMapping("/001")
	public List<Fda001> findAll(){
		return fda001Repository.findAll();
	}
}
