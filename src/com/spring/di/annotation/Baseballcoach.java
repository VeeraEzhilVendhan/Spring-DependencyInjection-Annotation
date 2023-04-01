package com.spring.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Baseballcoach implements Coach {

	//field injection
/*	@Autowired
	@Qualifier("bestFortune")*/
	private FortuneService fs; 
	
	//constructor injection
/*	@Autowired
    	public Baseballcoach(@Qualifier("bestFortune")FortuneService fs)
	{
		this.fs=fs;
	}
*/	
	@Override
	public String getWorkout() {
		
		return "practice batting daily";
	}

	@Override
	public String getFortune() {
		
		return fs.getFortune();
	}

	//setter injection 
	//for setter injection we can use qualifier annotation before or inside method parameter 
/*	@Autowired
	public void setFs(@Qualifier("bestFortune") FortuneService fs) {
		this.fs = fs;
	} */
	
	//method injection
	@Autowired
    @Qualifier("bestFortune")
	public void InjectFS(FortuneService fs)
	{
		this.fs=fs;
	}

	
	

}
