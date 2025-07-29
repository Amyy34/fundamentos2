package com.o8k.academy;

import java.util.Locale;
import java.util.Scanner;

public class MesesDoAnoCase {
    public void execute() {
        var entrada = new Scanner(System.in).useLocale(Locale.US);
        String lingua = "";

        do {
            System.out.println();
            System.out.println("EM PORTUGUÊS(ptBr) OU INGLÊS(en)?");

            lingua = entrada.nextLine().trim();

            if (lingua.isBlank()) {
                System.out.println();
                System.out.println("Informe uma lingua válida");
            }
        } while (lingua.isBlank());

        this.mostrarNomeDosMeses(lingua);
    }

    private void mostrarNomeDosMeses(String lingua) {
        System.out.println();
        System.out.println("OS MESES DO ANO EM " + lingua.toUpperCase() + " SÃO:");

        for (var mes : MesesDoAno.values()) {
            var name = "ptBr".equalsIgnoreCase(lingua) ? mes.getPtBr() : mes.getEn();
            System.out.println("=> " + name);
        }
    }
}
