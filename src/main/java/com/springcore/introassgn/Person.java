package com.springcore.introassgn;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("203")
	private int id;
	@Value("Gautam")
	private String name;
	@Value("Intern")
	private String desig;
	@Value("#{clist}")
	private List<String> contacts;
	@Value("#{dset}")
	private Set<String> projects;
	public Person() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", desig=" + desig + ", contacts=" + contacts + ",\n projects="
				+ projects + "]";
	}
	
}
