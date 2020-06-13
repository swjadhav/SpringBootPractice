package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneservices;
    public String getDailyWorkout() {
        return null;
    }

    public CricketCoach() {}


    public void setFortuneService(FortuneService fortuneservices){
        this.fortuneservices=fortuneservices;
    }
}