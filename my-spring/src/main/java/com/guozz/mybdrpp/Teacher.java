package com.guozz.mybdrpp;

public class Teacher {

	private String name;

	private Integer age;

	public Teacher() {
		System.out.println("---------执行teacher构造------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
