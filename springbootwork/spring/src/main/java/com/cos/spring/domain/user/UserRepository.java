package com.cos.spring.domain.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// IoC 메모리 떠야!! @RestController, @Component, @Repository
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	// 1. 공통적인 것들이 아니라, 특이한 쿼리, 통계쿼리(내가 직접 구현)
	
	@Query(value = "SELECT * FROM user WHERE username = :username AND password = :password", nativeQuery = true)
	Optional<User> mLogin(String username, String password);
	
	@Query(value = "SELECT * FROM user WHERE username = :username", nativeQuery = true)
	Optional<User> mUsernameDuplicateCheck(String username);
}
