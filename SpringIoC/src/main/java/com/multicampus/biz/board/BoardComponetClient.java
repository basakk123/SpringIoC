package com.multicampus.biz.board;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardComponetClient {

	public static void main(String[] args) {
		// 1. Spring 컨테이너 생성
		ClassPathXmlApplicationContext container = 
			new ClassPathXmlApplicationContext("business-layer.xml");
		
		// 2. 비즈니스 객체(BoardServiceImpl)를 획득
		BoardService boardService  = (BoardService) container.getBean("boardService");
		
		BoardVO vo = new BoardVO();
		vo.setCondition("title");
		vo.setKeyword("");
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		// 3. 컨테이너 종료
		container.close();
	}

}
