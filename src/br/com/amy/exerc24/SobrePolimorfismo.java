package br.com.amy.exerc24;

import br.com.amy.exerc23.ArtificialIntelligence;
import br.com.amy.exerc23.HarvesterAI;
import br.com.amy.exerc23.SentinelAI;

public class SobrePolimorfismo {
    public static void main(String[] args) {
        ArtificialIntelligence ai = new SentinelAI("234");
        ai.makeDecision("Devo comprar um carro?");
        System.out.println(ai.getDecisionsLog());
        System.out.println("");
        ai = new HarvesterAI();
        ai.makeDecision("Devo fazer uma pós ano que vem?");
        System.out.println(ai.getDecisionsLog());
    }
}
