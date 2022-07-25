package com.example.demo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainnn {
	
public static void main(String[] args) {

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	   Student student = (Student) applicationContext.getBean("student1");
	   System.out.println(student);
 }
}
