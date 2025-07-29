package br.com.amy.desafioFinal;

import java.util.Scanner;

public class MenuPrincipal {
    private final ImcCase imc =  new ImcCase();
    private final MesesDoAnoCase mesesDoAno = new MesesDoAnoCase();
    private final OrdenarListaCase ordenarLista = new OrdenarListaCase();
    private final PiadaCase piada = new PiadaCase();

    public void MostrarMenu() {
        Scanner teclado = new Scanner(System.in);
        String escolha;
        do {
            System.out.println(">> OLÁ! MEU NOME É 'SLAVE ROBOTO' SOU UMA IA EM CRESCIMENTO\n" +
                    ">> JÁ POSSO FAZER ALGUMAS COISAS, VÊ SE SÃO ÚTEIS PARA VOCÊ\n" +
                    "\n" +
                    "ESCOLHA UMA DAS OPÇÕES ABAIXO:\n" +
                    "0 ==> PARA FINALIZAR\n" +
                    "1 ==> IMPRIMIR O NOME DOS MESES DO ANO\n" +
                    "2 ==> PARA CALCULAR O ÍNDICE DE MASSA CORPORAL\n" +
                    "3 ==> PARA ORDENAR UMA LISTA DE STRINGS\n" +
                    "4 ==> ME CONTE UM PIADA :)");
            escolha = teclado.nextLine();
            if (escolha.isBlank()) {
                System.out.println("A ENTRADA NÃO PODE SER EM BRANCO!\n");
            }
            switch (escolha) {
                case "0":
                    System.out.println("SLAVE ROBOTO DIZ: ATÉ LOGO :)");
                    break;
                case "1":
                    mesesDoAno.Execute();
                    break;
                case "2":
                    imc.Execute();
                    break;
                case "3":
                    ordenarLista.Execute();
                    break;
                case "4":
                    piada.Execute();
                    break;
            }
        }while (escolha.isBlank() | !escolha.equals("0"));
        teclado.close();
    }
}
