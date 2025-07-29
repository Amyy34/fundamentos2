package br.com.amy.exerc28;

public class CrewMember {
    private final String name;
    private final int age;

    public CrewMember(String name, int age) {
        this.name = name.toUpperCase();
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }
}
