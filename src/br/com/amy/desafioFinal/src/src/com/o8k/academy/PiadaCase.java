package com.o8k.academy;

import java.util.ArrayList;
import java.util.Random;

public class PiadaCase {
    public void execute() {
        this.mostraPiada();
    }

    private void mostraPiada() {
        var listaDePiada = new ArrayList<String>();
        listaDePiada.add("O QUE É UM PROGRAMADOR? " +
                "\nUMA PESSOA QUE RESPONDE A UMA PERGUNTA COM PELO MENOS TRÊS PERGUNTAS.");
        listaDePiada.add("O QUE É UM ALGORITMO? " +
                "\nA PALAVRA UTILIZADA POR PROGRAMADORES QUANDO ESTES NÃO QUEREM EXPLICAR O QUE FIZERAM.");
        listaDePiada.add("O QUE É UM HARDWARE? " +
                "\nA PARTE DO COMPUTADOR QUE PODEMOS DAR PONTAPÉS.");

        var piadaSorteada = listaDePiada.get(new Random().nextInt(listaDePiada.size()));

        System.out.println();
        System.out.println(piadaSorteada);
    }

}
