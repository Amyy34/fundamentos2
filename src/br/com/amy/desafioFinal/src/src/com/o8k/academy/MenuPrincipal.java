package com.o8k.academy;

import java.util.Locale;
import java.util.Scanner;

public class MenuPrincipal {
    private final ImcCase imc = new ImcCase();
    private final MesesDoAnoCase mesesDoAno = new MesesDoAnoCase();
    private final OrdenarListaCase ordenarLista = new OrdenarListaCase();
    private final PiadaCase piada = new PiadaCase();

    public void mostrarMenu() {
        var opcao = "";
        var entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(">> OLÁ! MEU NOME É 'SLAVE ROBOTO' SOU UMA IA EM CRESCIMENTO");
        System.out.println(">> JÁ POSSO FAZER ALGUMAS COISAS, VÊ SE SÃO ÚTEIS PARA VOCÊ");

        do {
            System.out.println();
            System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO:");
            System.out.println("0 ==> PARA FINALIZAR");
            System.out.println("1 ==> IMPRIMIR OS NOMES DOS MESES DO ANO");
            System.out.println("2 ==> PARA CALCULAR O ÍNDICE DE MASSA CORPORAL");
            System.out.println("3 ==> PARA ORDENAR UMA LISTA DE STRINGS");
            System.out.println("4 ==> ME CONTE UM PIADA :)");

            opcao = entrada.nextLine();

            if (opcao.isBlank()) {
                System.out.println("A ENTRADA NÃO PODE SER EM BRANCO!");
                continue;
            }

            switch (opcao) {
                case "1":
                   this.mesesDoAno.execute();
                    break;
                case "2":
                    this.imc.execute();
                    break;
                case "3":
                    this.ordenarLista.execute();
                    break;
                case "4":
                    this.piada.execute();
                    break;
                default:
                    System.out.println("SLAVE ROBOTO DIZ: ATÉ LOGO :)");
            }

        } while (!opcao.equals("0"));

        entrada.close();
    }
}
