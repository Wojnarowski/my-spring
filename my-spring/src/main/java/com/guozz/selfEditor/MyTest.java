package com.guozz.selfEditor;

import com.guozz.resolveBeforeInstantiation.BeforeInstantiation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("address.xml");
		Customer customer = applicationContext.getBean(Customer.class);
		System.out.println(customer.toString());

	}
}
