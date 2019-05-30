package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Instrument;
import com.artiushenko.springTutorial.interfaces.Performer;

import java.util.Collection;
import java.util.Map;

public class OneManBand implements Performer {
    public OneManBand() {
    }

    @Override
    public void perform() {
        for (String key:instruments.keySet()) {
            System.out.print(key+": ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
