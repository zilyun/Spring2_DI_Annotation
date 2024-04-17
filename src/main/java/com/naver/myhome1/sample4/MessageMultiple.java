package com.naver.myhome1.sample4;

import org.springframework.stereotype.Component;
import jakarta.annotation.Resource;

@Component
public class MessageMultiple {
	
	private MessageBean messagebean;
	
	@Resource(name="m1")
	public void setBean(MessageBean messagebean) {
		this.messagebean = messagebean;
	}
	
	public MessageMultiple() {
		System.out.println("MessageMultiple 생성자입니다.");
	}
	
	public void print() {
		messagebean.sayHello("Spring");
	}
	
}
