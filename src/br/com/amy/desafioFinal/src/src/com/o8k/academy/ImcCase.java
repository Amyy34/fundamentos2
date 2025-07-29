package com.o8k.academy;

import java.util.Locale;
import java.util.Scanner;

public class ImcCase {
    public void execute() {
        var entrada = new Scanner(System.in).useLocale(Locale.US);
        Pessoa pessoa;

        do {
            System.out.println();
            System.out.println("QUAL O NOME DA PESSOA?");
            var nome = entrada.nextLine().trim();

            System.out.println("QUAL O PESO?");
            var peso = entrada.nextDouble();
            entrada.nextLine();

            System.out.println("QUAL A ALTURA?");
            var altura = entrada.nextDouble();
            entrada.nextLine();

            pessoa = new Pessoa(nome, peso, altura);

            if (pessoa.atributosNaoOk()) {
                System.out.println();
                System.out.println("INFORME DADOS VÁLIDOS");
            }
        } while (pessoa.atributosNaoOk());

        this.calcularImc(pessoa);
    }

    private void calcularImc(Humanoide humanoide) {
        System.out.println();
        System.out.printf("O IMC DE %s É: %.2f \n", humanoide.getNome(), humanoide.getImc());
    }
}
