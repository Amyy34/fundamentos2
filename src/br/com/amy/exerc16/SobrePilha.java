package br.com.amy.exerc16;

import java.util.ArrayDeque;

public class SobrePilha {
    public static void main(String[] args) {
        var pilha = new ArrayDeque<String>(); //O ultimo que entra é o primeiro que sai (igual uma pilha de livros).

        pilha.add("calça");
        pilha.push("livro"); // Adiciona e se não tiver espaço lança uma exceção.
    }
}