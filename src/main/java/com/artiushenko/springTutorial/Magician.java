package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.MagicBox;
import com.artiushenko.springTutorial.interfaces.Performer;

public class Magician implements Performer {
    public Magician() {
    }

    @Override
    public void perform() {
        System.out.println(magicWords);
        System.out.println("The magic box contains");
        System.out.println(magicBox.getContents());
    }

    private MagicBox magicBox;

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }
    private String magicWords;

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}
