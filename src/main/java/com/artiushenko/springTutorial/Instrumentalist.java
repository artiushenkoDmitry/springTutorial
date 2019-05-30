package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Instrument;
import com.artiushenko.springTutorial.interfaces.Performer;

public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    @Override
    public void perform() {
        System.out.println("Playing " +song + ": ");
        instrument.play();
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong(){
        return song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
