package org.ssh02.websocket;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.ssh02.pojo.User;

@Component(value = "webHandler")
public class MyHandler extends TextWebSocketHandler {

	private Map<User, WebSocketSession> map = new HashMap();

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("握手成功");
		User user = (User) session.getAttributes().get("user");
		map.put(user, session);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("消息处理");
		session.sendMessage(message);
	}

}
