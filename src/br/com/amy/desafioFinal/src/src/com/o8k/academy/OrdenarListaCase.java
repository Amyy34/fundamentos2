package com.o8k.academy;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class OrdenarListaCase {
    public void execute() {
        var entrada = new Scanner(System.in).useLocale(Locale.US);
        var listaDeStrings = "";

        do {
            System.out.println();
            System.out.println("INFORMA A LISTA DE STRINGS SEPARANDO CADA STRING POR ';'");
            listaDeStrings = entrada.nextLine().trim();

            if (this.listaVazia(listaDeStrings)) {
                System.out.println();
                System.out.println("A LISTA DEVE CONTER VALORES");
                continue;
            }

            this.mostrarListaOrdenada(listaDeStrings);
        } while (this.listaVazia(listaDeStrings));
    }

    private void mostrarListaOrdenada(String listaDeStrings) {
        String[] split = listaDeStrings.split(";");
        Arrays.sort(split, Collator.getInstance());

        System.out.println();
        System.out.println("SEGUE A LISTA ORDENADA:");
        System.out.println(Arrays.toString(split));
    }

    private boolean listaVazia(String listaDeStrings) {
        String listaSemDelimitador = listaDeStrings.replace(";", "").trim();
        return listaSemDelimitador.isBlank();
    }
}
