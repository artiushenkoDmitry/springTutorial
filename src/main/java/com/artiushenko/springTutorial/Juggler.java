package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
        this.beanBags = beanBags;
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("JUGGLING "  + beanBags + " BEANBAGS");
    }
}
