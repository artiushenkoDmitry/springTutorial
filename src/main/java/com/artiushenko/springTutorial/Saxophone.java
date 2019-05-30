package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Instrument;

public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("Saxophone is playing");
    }
}
