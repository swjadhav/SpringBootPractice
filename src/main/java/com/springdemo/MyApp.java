package com.springdemo;

public class MyApp {



    public  static void main(String[] args)
    {
        Coach mycoach = new BaseBallCoach();
        Coach mycoachCricket = new CricketCoach();
        System.out.println(mycoach.getDailyWorkOut());
        System.out.println(mycoachCricket.getDailyWorkOut());

    }


}
