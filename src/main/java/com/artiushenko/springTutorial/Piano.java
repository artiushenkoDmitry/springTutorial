package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Instrument;

public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}
