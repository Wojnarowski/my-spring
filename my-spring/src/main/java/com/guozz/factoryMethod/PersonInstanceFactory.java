package com.guozz.factoryMethod;

public class PersonInstanceFactory {

	public  Person getPerson(String name){
		Person person = new Person();
		person.setAge(11);
		person.setGender("2");
		person.setName(name);
		return person;
	}
}
