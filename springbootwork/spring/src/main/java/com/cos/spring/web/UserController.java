package com.cos.spring.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.spring.domain.user.LoginDTO;
import com.cos.spring.domain.user.User;
import com.cos.spring.domain.user.UserRepository;
import com.cos.spring.handler.CustomException;
import com.cos.spring.test.Animal;
import com.cos.spring.test.Dog;
import com.cos.spring.test.Tiger;

import lombok.RequiredArgsConstructor;

// FC로 등록됨, 그리고 Dispatcher가 관리함.
// Data를 리턴하는 컨트롤러
//@AllArgsConstructor // 모든 변수의 생성자를 만들어줌.
@RequiredArgsConstructor
@RestController
public class UserController {
	
	// final은 변수를 상수화 = 수정 불가능한 변수를 만드는 것
	// final은 값이 무조건 초기화 되어야 한다.(heap에 뜨기전에)
	private final Animal animal;
	private final Dog dog;
	private final UserRepository userRepository;
	private Tiger tiger;
	
	@GetMapping("/home")
	public String home() {
		System.out.println(animal.getName());
		System.out.println(dog.getName());
		return "<h1>home</h1>";
	}
	
	// User 정보 저장 함수(Post)
	// application/x-www-form-urlencoded => 키=값&키=값
	// 스프링 컨트롤러 기본전략 => application/x-www-form-urlencoded 파싱하게 설계되어 있음.
	// 오브젝트로 받능 수 있다.
	// @RequestBody를 적으면 raw 데이터를 받울 수 있다.
	// MessageConverter (작동)
    //  1. application/x-www-form-urlencoded 작동(기본)
	//  2. @RequestBody가 있으면  raw 작동
	@PostMapping("/user")
	public User save(@RequestBody User user) {
//		System.out.println(id);
//		System.out.println(username);
//		System.out.println(password);
//		System.out.println(email);
//		System.out.println("save 함수 : "+user);
		System.out.println(user);
		
		// 1. DB에 저장
		User userEntity = userRepository.save(user); // DB에 insert된 User 오브제그를 리턴받는다.
		// 2. 저장된 데이터 결과 응답하기
		return userEntity;
	}
	
	// User 정보 모두 돌려주는 함수(Get)
	@GetMapping("/user")
	public List<User> selectAll() {
		
		// 1. DB에서 select 하고
		List<User> users = userRepository.findAll(); // 여러건!! 컬렉션으로 받아야 함.
		
		// 2. 결과 응답하기
		
		return users; // Java Object를 리턴하면 스프힝이 자동으로 JSON으로 변경하여 리턴해준다.
	}
	
	// select * from user where id = 1;
	// User 정보중에 하나만 돌려주는 함수(Get)
	@GetMapping("/user/{id}")
	public User selectOne(@PathVariable int id) {
		System.out.println("selectOne :" + id);
		
		// 1. DB에서 select 하고
		// 2. 결과 응답하기
		// 3. 옵셔널 - 빈객체 리턴-> orElse(), 절대 빈개체 아니다->get(). 예외 던질 수 있다.->orElseThrow()
		// 4. 자바 1.8 람다식
		User UserEntity = userRepository.findById(id)
				.orElseThrow(() -> new CustomException("selectOne : 아이디를 잘못 입력하였습니다.")); //optional
		
		return UserEntity;
	}
	
	// UPDATE user SET username = ?, password = ?, email = ? WHERE id = ?
	// User 정보 수정하는 함수(Put)
	@PutMapping("/user/{id}")
	public User update(@RequestBody User user, @PathVariable int id) {
		System.out.println("update : " + user);
		System.out.println("id : " + id);
		
		User userEntity = userRepository.findById(id)
			.orElseThrow(() -> new CustomException("update : 수정할 아이디를 잘못 입력하였습니다."));
		
		userEntity.setUsername(user.getUsername());
		userEntity.setPassword(user.getPassword());
		userEntity.setEmail(user.getEmail());
		
		// 1. DB에서 update 하고
		User userUpdateEntity = userRepository.save(userEntity); // id 넣으면 DB에 그 id 가 있으면 update!!, 아니면 insert
		
		return userUpdateEntity;
	}
	
	// User 정보 삭제하는 함수(Delete)
	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable int id) {
		
		// 1. DB에서 delete 하고
		try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			throw new CustomException("delete : 삭제할 아이디를 찾을 수 없습니다.");
		}
		
		// 2. 삭제 잘됐다고 응답하기
		
		return "delete ok";
	}
	
	// select * from user where username = ? and password = ? 
	// http 1.1 방식에서 로그인 요청은 무조건 Post(password 정보가 날라가기 때문에)
	@PostMapping("/user/login")
	public String login(@RequestBody LoginDTO loginDTO) {
		System.out.println(loginDTO);
		userRepository.mLogin(loginDTO.getUsername(), loginDTO.getPassword())
			.orElseThrow(() -> new CustomException("login : 아이디와 패스워드를 잘못 입력하였습니다."));
		
		return "ok";
	}
	
	// Restful API 주소 방식 -> GET: /테이블명/where절
	// select * from user where username = ?
	@GetMapping("/user/check/{username}")
	public String usernameDuplicateCheck(@PathVariable String username) {
		
		userRepository.mUsernameDuplicateCheck(username)
			.orElseThrow(() -> new CustomException("usernameDuplicateCheck : 중복된 아이디가 없습니다.")); //optional
		
		return "중복된 아이디가 있습니다.";
	}
}
