package kr.happyjob.chainmaker.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.happyjob.chainmaker.basic.dao.UserMapper;
import kr.happyjob.chainmaker.basic.model.UserDTO;
import kr.happyjob.chainmaker.basic.model.UserVO;

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
