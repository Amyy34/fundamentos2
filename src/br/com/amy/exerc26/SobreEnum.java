package br.com.amy.exerc26;

import static br.com.amy.exerc26.Machines.SENTINELS;
import static br.com.amy.exerc26.MachinesSimple.ARMADAS;

public class SobreEnum {
    public static void main(String[] args) {
        var alerta1 = new Alert();
        alerta1.shouldAlert(ARMADAS);
        alerta1.shouldAlert(SENTINELS);
    }
}
