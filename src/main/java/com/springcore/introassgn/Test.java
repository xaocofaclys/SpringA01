package com.springcore.introassgn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("./com/springcore/introassgn/refconfig.xml");
		Person student = context.getBean("person",Person.class);
		System.out.println(student);
	}
}
