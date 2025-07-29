package br.com.amy.exerc23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArtificialIntelligence {
    List<String> decisionsLog = new ArrayList<>();

    public void makeDecision(String problem){
        var answer = decisionTree();
        decisionsLog.add(problem + "-> " + answer);
    }

    private boolean decisionTree(){
        return new Random().nextBoolean();
    }

    public List<String> getDecisionsLog() {
        return decisionsLog;
    }
}
