package br.com.amy.desafioFinal;

import java.util.Scanner;

public class ImcCase {

    public void Execute(){
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa = null;
        do {
            System.out.println("QUAL O NOME DA PESSOA?: ");
            String nome = teclado.nextLine();
            System.out.println("QUAL O PESO?: ");
            String pesoStr = teclado.nextLine();
            System.out.println("QUAL A ALTURA?: ");
            String alturaStr = teclado.nextLine();

            if (nome.isEmpty() || pesoStr.isEmpty() || alturaStr.isEmpty()) {
                System.out.println("Informe dados válidos!");
                continue;
            }

            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            pessoa = new Pessoa(nome, peso, altura);

        }while(pessoa == null || pessoa.AtributosNaoOk());

        CalcularImc(pessoa);
        teclado.close();

    }

    private void CalcularImc(Humanoide humanoide){
        System.out.printf("O IMC DE %s É: %.2f\n",humanoide.GetNome(),humanoide.GetImc());
    }
}
