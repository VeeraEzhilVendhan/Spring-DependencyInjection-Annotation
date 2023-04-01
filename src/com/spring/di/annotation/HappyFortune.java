package com.spring.di.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day";
	}

}
