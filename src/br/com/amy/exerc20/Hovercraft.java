package br.com.amy.exerc20;

import java.util.ArrayList;
import java.util.List;

public class Hovercraft {
    String name;
    List<Sensor> sensores = new ArrayList<>();

    public Hovercraft(String name) {
        this.name = name;
        this.sensores.add(new Sensor(123,false));
        this.sensores.add(new Sensor(456,true));
        this.sensores.add(new Sensor(789,true));
    }

    public void sensoresOn(){
        for(var sensor: sensores){
            sensor.on();
        }
    }

    public void sensoresOff(){
        for(var sensor: sensores){
            sensor.off();
        }
    }

    public void sensorOnByIndex(int index){
        sensores.get(index).on();
    }

    public void sensorOffByIndex(int index){
        sensores.get(index).off();
    }

    @Override
    public String toString() {
        return "Hovercraft{" +
                "name='" + name + '\'' +
                ", sensores=" + sensores +
                '}';
    }
}
