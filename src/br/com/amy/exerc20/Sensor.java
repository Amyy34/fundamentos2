package br.com.amy.exerc20;

public class Sensor {
    Integer serialNumber;
    Boolean on;

    public Sensor(Integer serialNumber, Boolean on) {
        this.serialNumber = serialNumber;
        this.on = on;
    }

    public void on(){
        this.on = true;
    }

    public void off(){
        this.on = false;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "serialNumber=" + serialNumber +
                ", on=" + on +
                '}';
    }
}
