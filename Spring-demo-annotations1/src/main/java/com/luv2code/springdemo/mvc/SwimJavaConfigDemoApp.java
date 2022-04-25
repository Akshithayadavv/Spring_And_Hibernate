package com.luv2code.springdemo.mvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.sup.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args){

        //read spring config file
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);


        //get bean from spring container
        SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        //call our new methods... has the props value injected
        System.out.println("email:" + theCoach.getEmail());
        System.out.println("team:" + theCoach.getTeam());
        //close the context
        context.close();
    }
}
