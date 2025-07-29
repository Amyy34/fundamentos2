package br.com.amy.exerc12;

public class EqualsTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", "Luiza");
        Pessoa pessoa2 = new Pessoa("Ana", "Luiza");

        System.out.println(pessoa1.equals(pessoa2));
    }
}
