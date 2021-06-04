package com.cos.spring.domain.user;

import lombok.Data;

// DTO = Data Transper Object
@Data
public class LoginDTO {
	private String username;
	private String password;
}
