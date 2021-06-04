package com.cos.spring.domain.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.cos.spring.domain.board.Board;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

// 도메인:(남, 여) 범주를 표햔할 때 사용하는 용어

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100)
	private String username;
	private String password;
	private String email;
	
	// EAGER 전략 : User 와 Board를 Join 해서 가져옴.
	// LAZY 전략 : 일단 User만 Select 하고, 나중에 getBoard를 호출할 때 board를 지연 select 해!!
	@JsonIgnoreProperties({"user"})
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY) // FK의 주인을 알려주는 방법 : mappedBy = 주인의 변수명
	private List<Board> board; // 어 ? board 오브젝트네 ? FK 만즐어야 되겠네?
}
