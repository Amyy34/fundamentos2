package br.com.amy.exerc25;

import java.util.Random;

public class Humanoide {
    private boolean isAgent;
    private boolean hasAGun;
    protected String accessLevel; // root and recruit
    protected boolean on;

    public Humanoide(String accessLevel) {
        this.isAgent = false;
        this.hasAGun = false;
        this.accessLevel = accessLevel;
        this.on = true;
    }

    public static char generateRandomSex(){
        var sexOptions = new char[]{'F','M'};
        return sexOptions[new Random().nextInt(2)];
    }

    public static String generateRandomHairColor(){
        var hairColors = new String[]{"Red","Blond","Dark","Gray","Blue","White"};
        return hairColors[new Random().nextInt(6)];
    }

    public void freeze(){
        if (accessLevel.equals("Root") || accessLevel.equals("Recruit")){
            return;
        }
        on = false;
    }

    public void turnIntoAgent(){
        isAgent = true;
        hasAGun = true;
    }
}
