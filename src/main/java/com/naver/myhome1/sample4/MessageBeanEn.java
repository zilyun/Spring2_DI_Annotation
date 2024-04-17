package com.naver.myhome1.sample4;

import org.springframework.stereotype.Component;

@Component("m")
public class MessageBeanEn implements MessageBean {
	
	public MessageBeanEn() {
		System.out.println("이곳은 MessageBeanEn 생성자입니다.");
	}
	
	// 추상메서드 오버라이딩
	@Override
	public void sayHello(String name) {
		System.out.println("Hello!" + name);
	}
}
