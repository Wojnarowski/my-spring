package com.guozz.factoryMethod;

import com.guozz.resolveBeforeInstantiation.BeforeInstantiation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("factoryMetho.xml");
		Person person = applicationContext.getBean("person",Person.class);
		System.out.println(person);

		Person person2 = applicationContext.getBean("person2",Person.class);
		System.out.println(person2);

	}
}
