package br.com.amy.exerc11;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que darão a nota: ");
        var qtdPessoas = teclado.nextInt();
        System.out.print("Digite quantos dias durará a avaliação: ");
        var qtdDias = teclado.nextInt();
        double[][] notasAlmoco = new double[qtdPessoas][qtdDias];
        double total = 0.0;

        for (int p = 0; p < notasAlmoco.length; p++) {
            for (int d = 0; d < notasAlmoco[p].length; d++) {
                System.out.printf("INFORME A NOTA DO DIA %d DA PESSOA %d: ", d + 1, p + 1);
                var notas = teclado.nextDouble();
                total += notas;
            }
        }
        var mediaNotas = total / (qtdPessoas * qtdDias);
        System.out.printf("A média das notas é: %.2f",mediaNotas);

        teclado.close();
    }
}
