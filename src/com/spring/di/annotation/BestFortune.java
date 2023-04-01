package com.spring.di.annotation;

import org.springframework.stereotype.Component;

@Component
public class BestFortune implements FortuneService {

	@Override
	public String getFortune() {
		
		return "today is your best day";
	}

}
