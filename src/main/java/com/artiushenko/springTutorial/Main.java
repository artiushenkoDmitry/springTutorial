package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("com.ariushenko.springTutorial/spring.xml");

        Performer performer = (Performer) context.getBean("duke");
        performer.perform();
    }
}