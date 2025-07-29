package br.com.amy.exerc25;

public class Treinamento {
    public static void main(String[] args) {
        var treinamento1 = new MatrixSimulation(25);
        var morpheus = new Person("Root",'M',"Dark");
        var recruit = new Person("Recruit",'M',Person.generateRandomHairColor());
        treinamento1.addActor(morpheus);
        treinamento1.addActor(recruit);
        treinamento1.run();
        treinamento1.catchRecruitAttention();
        treinamento1.turnCatchIntoAgent();
        treinamento1.freeze(morpheus);
        System.out.println("------------------------------------------------");
        System.out.println("Total count: " + treinamento1.totalInSimulation());
        System.out.println("Frozen count: " + treinamento1.howManyFrozen());
    }
}