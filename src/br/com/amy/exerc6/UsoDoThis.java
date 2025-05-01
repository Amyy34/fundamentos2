package br.com.amy.exerc6;

public class UsoDoThis {
    String nome;
    int idade;

    public UsoDoThis() {
        this("Não informado", 0);
    }

    public UsoDoThis(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        var pessoa1 = new UsoDoThis();
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
    }
}

