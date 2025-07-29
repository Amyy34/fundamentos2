package br.com.amy.exerc28;

public class GetterAndSetter {
    public static void main(String[] args) {
        var tripulante1 = new CrewMember("Amy",20);
        System.out.println("O nome do tripulante é: " + tripulante1.getName());
        System.out.println("A idade do tripulante é: " + tripulante1.getAge());
    }
}
