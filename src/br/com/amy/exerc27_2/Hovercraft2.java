package br.com.amy.exerc27_2;

import br.com.amy.exerc27.Ship;

public class Hovercraft2 extends Ship {
    String name;
    public Hovercraft2(String name) {
        super(name);
    }

    private String privateChannel06(){
        return name + ": Channel 106: I hear you";
    }

    protected String protectedChannel1021(){
        return super.protectedChannel1021();
    }
}
