package com.guozz.supplier;

import com.guozz.resolveBeforeInstantiation.BeforeInstantiation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("supplier.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user.getUserName());

	}
}
