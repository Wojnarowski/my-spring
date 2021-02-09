package com.guozz.populateBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PopulateBeanTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("populateBean.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person.toString());

	}
}
