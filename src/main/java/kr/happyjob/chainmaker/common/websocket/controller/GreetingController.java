package kr.happyjob.chainmaker.common.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import kr.happyjob.chainmaker.common.websocket.domain.Greeting;
import kr.happyjob.chainmaker.common.websocket.domain.HelloMessage;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

@Controller
public class GreetingController {
	
	//@MessageMapping은 클라이언트에서 /hello쪽으로 메세지를 전달하면 greeting메서드가 실행
	@MessageMapping("/hello")
	//이 메서드는 다시 @SendTo 어노테이션에 정의된 쪽으로 결과를 return
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {
		// delay 주기
		Thread.sleep(100); 
		
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}

}
