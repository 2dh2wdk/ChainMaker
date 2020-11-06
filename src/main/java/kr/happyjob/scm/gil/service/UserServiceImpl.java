package kr.happyjob.scm.gil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.happyjob.scm.gil.dao.UserMapper;
import kr.happyjob.scm.gil.model.UserDTO;
import kr.happyjob.scm.gil.model.UserVO;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	
	@Override
	public UserDTO getUserInfoByLoginID(String loginID) {
		
		UserVO userVO = userMapper.getUserInfoByLoginID(loginID);
		
		UserDTO userDTO = new UserDTO(userVO);
		
		return userDTO;
	}

}
