package com.guozz.factoryMethod;

public class PersonStaticFactory {

	public static Person getPerson(String userName){
		Person person = new Person();
		person.setAge(11);
		person.setGender("2");
		person.setName(userName);
		return person;
	}
}
