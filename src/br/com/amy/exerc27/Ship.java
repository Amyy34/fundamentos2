package br.com.amy.exerc27;

public class Ship {
    String name;

    public Ship(String name) {
        this.name = name;
    }

    String packageChannel4056(){
        return name + ": Channel 4056: I hear you";
    }

    protected String protectedChannel1021(){
        return name + ": Channel 1021: I hear you";
    }

    public String publicChannel1010(){
        return name + ": Channel 1010: I hear you";
    }
}
