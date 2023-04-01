package com.spring.di.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		
		Coach coach=context.getBean("baseballcoach",Coach.class);
		
		System.out.println(coach.getWorkout());
		System.out.println(coach.getFortune());
		
		context.close();
	
	}

}
