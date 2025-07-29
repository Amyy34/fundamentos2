package br.com.amy.exerc25;

public class Person extends Humanoide{
    char sex;
    String hairColor;

    public Person(String accessLevel, char sex, String hairColor) {
        super(accessLevel);
        this.sex = sex;
        this.hairColor = hairColor;
    }

    public static Person generateRandomPerson(){
        return new Person("Actor",generateRandomSex(),generateRandomHairColor());
    }
}
