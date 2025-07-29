package br.com.amy.exerc26;

public class Alert {

    public void shouldAlert(MachinesSimple machine){
        if (MachinesSimple.SENTINELS == machine){
            System.out.println("DANGER! SENTINELS DETECTED!!!!");
        }
    }

    public void shouldAlert(Machines machine){
        if (machine.isAggressive()){
            System.out.println("DANGER! AGGRESSIVE MACHINE DETECTED: " + machine.name());
            return;
        }
        System.out.println("ALERT! A NON AGGRESSIVE MACHINE DETECTED: " + machine.name());
    }
}
