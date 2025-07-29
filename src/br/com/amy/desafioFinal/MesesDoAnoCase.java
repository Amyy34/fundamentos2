package br.com.amy.desafioFinal;

import java.util.Scanner;

public class MesesDoAnoCase {
    Scanner teclado = new Scanner(System.in);

    public void Execute(){
        var escolha = "";
        do {
            System.out.println("EM PORTUGUÊS(ptBr) OU INGLÊS(en)?");
            escolha = teclado.nextLine().trim().toLowerCase();

            switch (escolha) {
                case "ptbr" -> {
                    MostrarNomeDosMeses(Language.PTBR);
                    return;
                }
                case "en" -> {
                    MostrarNomeDosMeses(Language.EN);
                    return;
                }
                case "" -> {
                    System.out.println("INFORME UMA LINGUA VÁLIDA\n");
                    continue;
                }
            }
        }while (escolha.isBlank());
        teclado.close();
    }

    private void MostrarNomeDosMeses(Language lingua){
        if (Language.PTBR.equals(lingua)){
            System.out.println("JANEIRO\n"+
                    "FEVEREIRO\n"+
                    "MARÇO\n"+
                    "ABRIL\n"+
                    "MAIO\n"+
                    "JUNHO\n"+
                    "JULHO\n"+
                    "AGOSTO\n"+
                    "SETEMBRO\n"+
                    "OUTUBRO\n"+
                    "NOVEMBRO\n"+
                    "DEZEMBRO\n"
            );
            } else if (Language.EN.equals(lingua)) {
            System.out.println("JANUARY\n" +
                    "FEBRUARY\n" +
                    "MARCH\n" +
                    "APRIL\n" +
                    "MAY\n" +
                    "JUNE\n" +
                    "JULY\n" +
                    "AUGUST\n" +
                    "SEPTEMBER\n" +
                    "OCTOBER\n" +
                    "NOVEMBER\n" +
                    "DECEMBER\n");
        }
    }
}
