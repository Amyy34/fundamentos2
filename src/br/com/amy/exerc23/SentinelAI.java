package br.com.amy.exerc23;

import java.util.List;

public class SentinelAI extends ArtificialIntelligence{
    String code;

    public SentinelAI(String code) {
        this.code = code;
    }

    @Override
    public List<String> getDecisionsLog() {
        System.out.println("RETRIEVING LOG FROM IA:" + code);
        return super.getDecisionsLog();
    }

}
