package service;

import java.util.List;

import vo.UserVO;

public interface UserService {
	int addUser(UserVO vo);
	int updateUser(UserVO vo);
	List <UserVO> UserList();
	int login (UserVO vo);
	int checkUser(UserVO vo);
}
