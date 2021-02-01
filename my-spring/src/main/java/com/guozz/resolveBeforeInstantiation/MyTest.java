package com.guozz.resolveBeforeInstantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beforeInstantiation.xml");
		BeforeInstantiation beforeInstantiation = applicationContext.getBean(BeforeInstantiation.class);
		beforeInstantiation.doSomeThing();

	}
}
