package com.luv2code.springdemo.mvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.sup.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args){

        //read spring config file
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);


        //get bean from spring container
        Coach theCoach=context.getBean("tennisCoach",Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
