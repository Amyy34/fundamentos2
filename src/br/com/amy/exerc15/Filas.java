package br.com.amy.exerc15;

import java.util.LinkedList;

public class Filas {
    public static void main(String[] args) {
        var filaParaDespertar = new LinkedList<String>(); // O primeiro que entra é o primeiro que sai.
        filaParaDespertar.add("João");
        filaParaDespertar.add("Maria");
        filaParaDespertar.add("Pedro"); // Insere um elemento na fila, porém se nao tiver espaço ele da erro.
        filaParaDespertar.offer("José"); // Só adiciona o elemento na fila caso haja espaço, se não houver espaço ele lança uma exceção.

        System.out.println("Conferindo se a fila está vázia: " + filaParaDespertar.isEmpty());
        System.out.println("Conferindo o tamanho da fila: " + filaParaDespertar.size());
        System.out.println("Imprindo o primeiro elemento sem remove-lo, se a lista tiver vazia ele retorna nulo. " + filaParaDespertar.peek());
        System.out.println("Impriminto o primeiro elemento sem remove-lo, se estiver vazio lança uma exceção. " + filaParaDespertar.element());

        while (!filaParaDespertar.isEmpty()) {
            System.out.println("Retorna o próximo elemento da fila já removendo o elemento" + filaParaDespertar.poll());
        }
        System.out.println(filaParaDespertar);
    }
}
