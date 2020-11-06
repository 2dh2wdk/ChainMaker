package kr.happyjob.scm.gil.dao;

import kr.happyjob.scm.gil.model.UserVO;

public interface UserMapper {

	// user 정보 test 용도
	public UserVO getUserInfoByLoginID(String loginID);

}
