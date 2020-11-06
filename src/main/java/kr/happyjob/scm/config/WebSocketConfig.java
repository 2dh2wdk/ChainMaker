package kr.happyjob.scm.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

//@Configuration, @EnableWebSocketMessageBroker를 통해 WebSocket과 관련된 설정을 작동
@Configuration
@EnableWebSocketMessageBroker

//WebSocketConfig 클래스는 WebSocketMessageBrokerConfigurer를 implements하고 두 개의 메서드를 오버라이딩
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{

	//메세지 브로커(Message Broker)는 송신자에게 수신자의 이전 메세지 프로토콜로 변환해주는 모듈 중에 하나이다. 
	//요청이 오면 그에 해당하는 통신 채널로 전송해주고 응답 역시 왔던 길을 그대로 다시 가서 안정적으로 메세지를 응답해주기 위한 부분
	
	
	
	
	
	//configureMessageBroker()
	//enableSimpleBroker는 클라이언트로 메세지를 응답해줄 때 prefix를 정의한다.
	//setApplicationDestinationPrefixes는 클라이언트에서 메세지 송신 시 붙여줄 prefix를 정의한다.
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry){
		registry.enableSimpleBroker("/topic");
		registry.setApplicationDestinationPrefixes("/app");
	}
	
	//registerStompEndpoints()
	//최초 소켓 연결을 하는 경우, endpoint가 되는 url이다. 
	//추후 javascript에서 SockJS 생성자를 통해 연결될 것이다.
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry){
		registry.addEndpoint("/websocket").withSockJS();
	}
	
	
	
	
	

	@Override
	public void configureWebSocketTransport(WebSocketTransportRegistration registry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureClientInboundChannel(ChannelRegistration registration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureClientOutboundChannel(ChannelRegistration registration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean configureMessageConverters(List<MessageConverter> messageConverters) {
		// TODO Auto-generated method stub
		return false;
	}
}
