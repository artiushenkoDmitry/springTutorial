package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Thincker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("com.ariushenko.springTutorial/spring.xml");

        Thincker thincker = (Thincker) context.getBean("volunteer");
        thincker.thinkOfSomething("нечто");
        }
}