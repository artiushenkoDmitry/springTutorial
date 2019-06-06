package com.artiushenko.springTutorial;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut(
            "execution(* com.artiushenko.springTutorial.interfaces.Performer.perform(..))")
    public void performance() { //Определение точки сопряжения. Метод performance() используется только для именования
                                // точки сопряжения, тело метода должно быть пустым.
    }
//    @Before("performance()")    // Перед выступлением
//    public void takeSeats() {
//        System.out.println("The audience is taking their seats.0");
//    }
//    @Before("performance()")    // Перед выступлением
//    public void turnOffCellPhones() {
//        System.out.println("The audience is turning off their cellphones0");
//    }
//    @AfterReturning("performance()")    // После успешного выступления
//    public void applaud() {
//        System.out.println("CLAP CLAP CLAP CLAP CLAP0");
//    }
//    @AfterThrowing("performance()") // После неудачного выступления
//    public void demandRefund() {
//        System.out.println("Boo! We want our money back!0");
//    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();
            joinpoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start)
                    + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}

