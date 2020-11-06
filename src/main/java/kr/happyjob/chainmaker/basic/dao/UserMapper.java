package kr.happyjob.chainmaker.basic.dao;

import kr.happyjob.chainmaker.basic.model.UserVO;

public interface UserMapper {

	// user 정보 test 용도
	public UserVO getUserInfoByLoginID(String loginID);

}
