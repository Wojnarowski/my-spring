package com.guozz.populateBean;

import java.util.List;

public class Person {

	private String  name;

	private Address address;

	private List<Book> bookList;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
