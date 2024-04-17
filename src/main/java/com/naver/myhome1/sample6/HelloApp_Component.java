package com.naver.myhome1.sample6;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp_Component {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext(
				"com/naver/myhome1/sample6/applicationContext6.xml");
		
		MessageBean m3 = (MessageBeanImpl) ctx.getBean("m3");

		m3.sayHello(); // 메서드 호출합니다.
		
		ctx.close();
	}
}
