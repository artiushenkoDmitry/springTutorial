package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.Thincker;

public class Volunteer implements Thincker {
    public String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
