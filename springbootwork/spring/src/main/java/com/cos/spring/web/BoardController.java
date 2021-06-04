package com.cos.spring.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.spring.domain.board.Board;
import com.cos.spring.domain.board.BoardRepository;
import com.cos.spring.domain.user.User;
import com.cos.spring.domain.user.UserRepository;
import com.cos.spring.handler.CustomException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BoardController {
	
	private final BoardRepository boardRepository;
	private final UserRepository userRepository;
	
	@PostMapping("/board")
	public Board save(@RequestBody Board board) {
		User userEntity = userRepository.findById(1)
				.orElseThrow(() -> new CustomException("save : 유저의 id가 잘못되었습니다."));
		
		board.setUser(userEntity); // FK 추가하는 법
		
		Board boardEntity = boardRepository.save(board);
		
		return boardEntity;
	}
	
	@GetMapping("/board")
	public List<Board> findAll() {
		return boardRepository.findAll();
	}
	
	@GetMapping("/board/{id}")
	public Board findById(@PathVariable int id) {
		return boardRepository.findById(id)
						.orElseThrow(() -> new CustomException("findById : board의 id가 잘못되었습니다."));
	}
 }
