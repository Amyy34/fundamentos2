package br.com.amy.desafioFinal;

import java.util.*;

public class OrdenarListaCase {

    public void Execute() {
        Scanner teclado = new Scanner(System.in);
        String lista;

        do {
            System.out.println("INFORME A LISTA DE STRINGS SEPARANDO CADA STRING POR ';': ");
            lista = teclado.nextLine();

            if (ListaVazia(lista)) {
                System.out.println("A LISTA DEVE CONTER VALORES!");
            }

        } while (ListaVazia(lista));

        MostrarListaOrdenada(lista);
    }

    private boolean ListaVazia(String listaStr) {
        if (listaStr == null || listaStr.isBlank()) {
            return true;
        }

        String[] itens = listaStr.split(";");
        for (String item : itens) {
            if (!item.trim().isEmpty()) {
                return false;
            }
        }

        return true;
    }

    private void MostrarListaOrdenada(String listaStr) {
        String[] itens = listaStr.split(";");
        List<String> lista = new ArrayList<>();

        for (String item : itens) {
            String valor = item.trim();
            if (!valor.isEmpty()) {
                lista.add(valor);
            }
        }

        Collections.sort(lista);

        for (String item : lista) {
            System.out.println(item);
        }
    }
}

