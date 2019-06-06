package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.MindReader;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader {
    private String thoughts;

    // Объявление параметризованного среза множества точек сопряжения
    @Pointcut("execution(* com.artiushenko.springTutorial.interfaces.Thincker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
    }

    @Before("thinking(thoughts)")   // Передача параметра в совет
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts : " + thoughts);
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
