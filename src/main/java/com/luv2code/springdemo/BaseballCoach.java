
package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	private  FortuneService fortuneServ;

	BaseballCoach(FortuneService fortuneServv)
	{
		this.fortuneServ=fortuneServv;
	}



	public String getDailyWorkout() {
		System.out.println("Spend 30 minutes on batting practice for BaseBall");

		System.out.println("This is fortune call - "+fortuneServ.getFortuneService());

		return "";
	}

}
