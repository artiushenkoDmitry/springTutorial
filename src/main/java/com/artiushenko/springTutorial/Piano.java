package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Instrument;
import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}
