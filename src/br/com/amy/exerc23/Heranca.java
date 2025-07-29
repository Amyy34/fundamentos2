package br.com.amy.exerc23;

public class Heranca {
    public static void main(String[] args) {
        var sentinela = new SentinelAI("23");
        sentinela.makeDecision("Devo atacar?");
        sentinela.makeDecision("Devo fugir?");
        sentinela.makeDecision("Devo me esconder?");
        var harverster = new HarvesterAI();
        harverster.makeDecision("Devo colher?");
        harverster.makeDecision("Devo mover?");
        harverster.makeDecision("Devo fazer manutenção?");

        for (var log: sentinela.getDecisionsLog()){
            System.out.println(log);
        }

        System.out.println("-------------------");

        for (var log: harverster.getDecisionsLog()){
            System.out.println(log);
        }

    }
}
