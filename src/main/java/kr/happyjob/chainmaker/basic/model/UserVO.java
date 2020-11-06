package kr.happyjob.chainmaker.basic.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of={"loginID"})
public class UserVO {
	@NonNull
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
}
