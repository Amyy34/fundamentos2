package br.com.amy.exerc21;

import java.util.ArrayList;
import java.util.List;

public class Trigger {
    String name;
    String action;
    boolean actionDone;
    List<Sensor> sensores = new ArrayList<>();


    public Trigger(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public void addSensor(Sensor sensor){
        sensores.add(sensor);
        sensor.triggers.add(this);
    }

    public void shouldTrigger(){
        System.out.println("trigger: "+ name);
        for(var sensor: sensores){
            if (!sensor.on){
                continue;
            }
            if (sensor.isDetected() && actionDone){
                continue;
            }
            if (sensor.isDetected()) {
                System.out.println("ALERTA! -> TRIGGER: " + name + " ON. INDICANDO AÇÃO -> " + action);
                actionDone = true;
                return;
            }
            System.out.println("TUDO CERTO NO SENSOR: " + sensor.serialNumber);
        }
    }
}
