package kr.happyjob.chainmaker.basic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
	private String loginID;
	
	private String user_type;
	private String name;
	private String password;
	private String age;
	private String sex;
	private String hp;
	private String tel1;
	private String tel2;
	private String tel3;
	private String email;
	private String zipcd;
	private String addr;
 	private String dtladdr;
	private String joinDate;
	private String course;
	private String file_name;
	private String file_path;
	private int file_size;	
	private String marride;
	private String milservice;
	private String anarm;
	private String mil_str_date;
	private String mil_end_date;
	
	@Builder
	public UserDTO(String loginID, String name){
		this.loginID = loginID;
		this.name = name;
	}
	
	public UserDTO(UserVO userVO){
		this.loginID = userVO.getLoginID();
		this.user_type = userVO.getUser_type();
		this.name = userVO.getName();
		this.password = userVO.getPassword();
		this.age = userVO.getAge();
		this.sex = userVO.getSex();
		this.hp = userVO.getHp();
		this.tel1 = userVO.getTel1();
		this.tel2 = userVO.getTel2();
		this.tel3 = userVO.getTel3();
		this.email = userVO.getEmail();
		this.zipcd = userVO.getZipcd();
		this.addr = userVO.getAddr();
		this.dtladdr = userVO.getDtladdr();
		this.joinDate = userVO.getJoinDate();
		this.course = userVO.getCourse();
		this.file_name = userVO.getFile_name();
		this.file_path = userVO.getFile_path();
		this.file_size = userVO.getFile_size();
		this.marride = userVO.getMarride();
		this.milservice = userVO.getMilservice();
		this.anarm = userVO.getAnarm();
		this.mil_str_date = userVO.getMil_str_date();
		this.mil_end_date = userVO.getMil_end_date();
	}
}
