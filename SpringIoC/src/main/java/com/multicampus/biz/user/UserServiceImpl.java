package com.multicampus.biz.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	public void insertUser(UserVO vo) {
		// TODO Auto-generated method stub

	}

	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub

	}

	public void deleteUser(UserVO vo) {
		// TODO Auto-generated method stub

	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

	public List<UserVO> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

}
