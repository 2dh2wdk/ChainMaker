package kr.happyjob.scm.gil.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.happyjob.scm.gil.model.UserDTO;
import kr.happyjob.scm.gil.model.UserVO;
import kr.happyjob.scm.gil.service.UserService;

@Controller
@RequestMapping(value = "/gil")
public class GilController {
	
	private static final Logger logger = LoggerFactory.getLogger(GilController.class);
	
	@Autowired
	UserService userService;
	
	// MVC 기본 구조
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mvcBasic(Model model) {
		logger.info("GilContorller.mvcBasic() 실행 중");
	
		String anyLetterCanBeHere = "테스트 중 입니다.";
		
		String loginID = "admin";
		
		UserDTO userDTO = userService.getUserInfoByLoginID(loginID);
		
		String name = userDTO.getName();

		model.addAttribute("message", anyLetterCanBeHere);
		model.addAttribute("loginID", loginID);
		model.addAttribute("name", name);
		
		model.addAttribute("userDTO", userDTO);
		
		return "gil/mvc_basic";
	}
	
	// Vue 관련 기본 예제
	@RequestMapping(value = "/vuebasic", method = RequestMethod.GET)
	public String vueBasic(){

		logger.info("GilContorller.vueBasic() 실행 중");
		
		return "gil/vue_basic";
	}
	
	// Vue dataTable 예제
	@RequestMapping(value = "/vuedatatable", method = RequestMethod.GET)
	public String vueDataTable(){

		logger.info("GilContorller.vueDataTable() 실행 중");
		
		return "gil/vue_datatable";
	}
}
