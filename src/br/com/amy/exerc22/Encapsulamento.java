package br.com.amy.exerc22;

public class Encapsulamento {
    public static void main(String[] args) {
        var treinamento1 = new Treinamento();
        treinamento1.addName("");
//      treinamento1.nome;
        treinamento1.addName("Java");
        System.out.println(treinamento1);
    }
}
