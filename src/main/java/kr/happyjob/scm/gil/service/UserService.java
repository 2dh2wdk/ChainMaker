package kr.happyjob.scm.gil.service;

import kr.happyjob.scm.gil.model.UserDTO;

public interface UserService {

	// loginID로 UserInfo 가져오기
	public UserDTO getUserInfoByLoginID(String loginID);
}
