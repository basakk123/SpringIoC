package com.multicampus.biz.user;

import java.util.List;

public interface UserService {

	// 사용자 등록
	void insertUser(UserVO vo);

	// 사용자 수정
	void updateUser(UserVO vo);

	// 사용자 삭제
	void deleteUser(UserVO vo);

	// 로그인 시 사용자 조회
	UserVO getUser(UserVO vo);

	// 전체 사용자 목록 조회
	List<UserVO> getUserList();

}