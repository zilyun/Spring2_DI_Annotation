package com.naver.myhome1.sample2;

public class MessageBeanEn implements MessageBean {
	
	public MessageBeanEn() {
		System.out.println("이곳은 MessageBeanEn 생성자입니다.");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("Hello!" + name);
	}
}
