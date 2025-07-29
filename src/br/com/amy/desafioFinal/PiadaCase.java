package br.com.amy.desafioFinal;

import java.util.Random;

public class PiadaCase {

    public void Execute() {
        MostrarPiada();
    }

    private String[] piadas = {
            "Por que o livro de matemática se suicidou? Porque tinha muitos problemas.",
            "O que o tomate foi fazer no banco? Tirar extrato.",
            "Por que o computador foi ao médico? Porque estava com vírus.",
            "Qual é o animal mais antigo? A zebra, porque está em preto e branco.",
            "Por que o menino levou uma escada para a escola? Porque ia para o ensino superior.",
            "Por que o lápis foi ao médico? Porque estava sem ponta!",
            "Qual é o cúmulo da rapidez? Correr atrás de uma moto e alcançar o vento!",
            "O que a impressora falou para o papel? “Estou com um problema, você está atolando minha cabeça!”",
            "Por que a vaca foi para o espaço? Para se encontrar com a Via Láctea!",
            "Como o elétron atende ao telefone? Próton!",
            "Por que o jacaré tirou o filho da escola? Porque ele réptil de ano!",
            "Qual é o animal mais esquecido? O elefante, porque nunca esquece! (Mas é mentira!)",
            "O que é um pontinho vermelho no céu? Um morango voador!",
            "Por que o boi foi para o cinema? Porque queria ver um filme de ação!",
            "Qual é o peixe que caiu do décimo andar e sobreviveu? O atum!"
    };


    private void MostrarPiada() {
        Random aleatorio = new Random();
        int index = aleatorio.nextInt(piadas.length);
        System.out.println(piadas[index]);
    }
}

