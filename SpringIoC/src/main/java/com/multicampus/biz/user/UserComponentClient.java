package com.multicampus.biz.user;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserComponentClient {

	public static void main(String[] args) {
		// 1. Spring 컨테이너 생성
		ClassPathXmlApplicationContext container = 
			new ClassPathXmlApplicationContext("business-layer.xml");
		
		// 2. 비즈니스 객체(UserServiceImpl)를 획득
		UserService userService  = (UserService) container.getBean("userService");
		
		UserVO vo = new UserVO();
		vo.setId("admin");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "님 로그인 환영");
		} else {
			System.out.println("로그인 실패");
		}
		
		// 3. 컨테이너 종료
		container.close();
	}

}
