package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Contestant;

public class GraciousContestant implements Contestant {
    @Override
    public void receiveAward() {
        System.out.println("award received");
    }
}
