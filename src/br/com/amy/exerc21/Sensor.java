package br.com.amy.exerc21;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    Integer serialNumber;
    Boolean on;
    boolean detected;
    List<Trigger> triggers = new ArrayList<>();

    public Sensor(Integer serialNumber, Boolean on) {
        this.serialNumber = serialNumber;
        this.on = on;
    }

    public void addTrigger(Trigger trigger){
        triggers.add(trigger);
        trigger.sensores.add(this);
    }

    public boolean isDetected(){
        return detected;
    }
}
