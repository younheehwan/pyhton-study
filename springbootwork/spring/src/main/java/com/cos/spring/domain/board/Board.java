package com.cos.spring.domain.board;

import java.sql.Timestamp;
import java.util.TimerTask;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.cos.spring.domain.user.User;

import lombok.Data;

@Entity
@Data
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	@Lob
	private String content;
	
	@JoinColumn(name = "userId")
	@ManyToOne(fetch = FetchType.EAGER) // EAGER
	private User user; // 순방향 매핑
	
	@CreationTimestamp // save 될 대 마다 현재시간을 입력해 준다.
	private Timestamp created;
}
