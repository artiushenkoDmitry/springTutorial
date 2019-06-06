package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Instrument;
import com.artiushenko.springTutorial.interfaces.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component("kenny")
public class Instrumentalist implements Performer {
    public int i = 0;

    public Instrumentalist() {
        i = (int) (Math.random() * 10);
        System.out.println(i);
    }

    @Override
    public void perform() {
        System.out.println("Playing: " + song);
        instrument.play();
    }

    private String song = "дефолтная песня";

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Autowired
    private Instrument instrument;

//    public void setInstrument(Instrument instrument) {
//        this.instrument = instrument;
//    }
}
