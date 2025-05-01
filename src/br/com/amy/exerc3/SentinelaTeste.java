package br.com.amy.exerc3;

public class SentinelaTeste {
    public static void main(String[] args) {
        Sentinela sentinela1 = new Sentinela("sentinela1");
        Sentinela sentinela2 = new Sentinela("Sentinela2", true);
        Sentinela sentinela3 = new Sentinela();

        System.out.printf("A sentinela 1, nome: %s está ativo? %s.\n",sentinela1.nome, sentinela1.ativo);
        System.out.printf("A sentinela 2, nome: %s está ativo? %s.", sentinela2.nome, sentinela2.ativo);
    }
}
