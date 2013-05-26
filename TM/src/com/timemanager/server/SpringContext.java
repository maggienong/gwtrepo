package com.timemanager.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContext {
	private ApplicationContext context;
	
	static private SpringContext instance = new SpringContext();
	
	private SpringContext() {
		context =  new ClassPathXmlApplicationContext("beans.xml");
		 
	}
	
	public static SpringContext getInstance() {
		return instance;
	}
	
	public Object getBean(String name) {
		return context.getBean(name);
	}
}
