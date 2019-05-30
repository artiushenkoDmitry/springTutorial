package com.artiushenko.springTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
        Person person = (Person) context.getBean("person");
        person.speak();
    }
}
