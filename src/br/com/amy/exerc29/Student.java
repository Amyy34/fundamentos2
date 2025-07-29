package br.com.amy.exerc29;

public class Student implements Karate, KungFu, MartialArts {

    @Override
    public void SeikenTiudanZuki() {
        System.out.println("Sinta o meu poderoso golpe! Hahahahahaha");
    }

    @Override
    public void dragonTechnique() {
         System.out.println("Cólera do dragãoooooooooo!");
    }

    @Override
    public void greetings() {
        System.out.println("Olá, seja bem vindo a sala 2!");
    }
}
