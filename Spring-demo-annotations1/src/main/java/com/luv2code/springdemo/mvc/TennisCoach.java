package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("Inside the default constructor");

    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">>TennisCoach: inside of doMyStartupstuff");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">>TennisCoach: inside of doMyCleanupstuff");
    }
    //define a setter method
    /*@Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        fortuneService= theFortuneService;
    }

     */
    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService){
        System.out.println(">> TennisCoach: inside doSomeCrazystuff() method");
        fortuneService= theFortuneService;
    }
    */

/*
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    */
    @Override
    public String getDailyWorkout(){
        return "practice your backhand volley";
    }

    @Override
    public String getDailyFortune(){
        return  fortuneService.getFortune();
    }
}
