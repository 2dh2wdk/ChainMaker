package kr.happyjob.chainmaker.basic.service;

import kr.happyjob.chainmaker.basic.model.UserDTO;

public interface UserService {

	// loginID로 UserInfo 가져오기
	public UserDTO getUserInfoByLoginID(String loginID);
}
