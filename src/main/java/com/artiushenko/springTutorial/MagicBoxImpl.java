package com.artiushenko.springTutorial;

import com.artiushenko.springTutorial.interfaces.MagicBox;

public class MagicBoxImpl implements MagicBox {
    public MagicBoxImpl() {
    }

    @Override
    public String getContents() {
        return "A beautiful assistant";
    }
}
