package com.artiushenko.springTutorial;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut(
            "execution(* com.artiushenko.springTutorial.interfaces.Performer.perform(..))")
    public void performance() { //Определение точки сопряжения. Метод performance() используется только для именования
                                // точки сопряжения, тело метода должно быть пустым.
    }
    @Before("performance()")    // Перед выступлением
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }
    @Before("performance()")    // Перед выступлением
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    @AfterReturning("performance()")    // После успешного выступления
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    @AfterThrowing("performance()") // После неудачного выступления
    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }
}

