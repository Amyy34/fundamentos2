package br.com.amy.exerc19;

public class Hovercraft {
    String name;
    Integer currentSpeed = 0;
    Motor motor;

    public Hovercraft(String name) {
        this.name = name;
        this.motor = new Motor(123);
    }

    public void turnOn() {
        this.motor.on = true;
    }

    public void turnOff() {
        this.motor.on = false;
    }

    public boolean isOn() {
        return motor.on;
    }

    public void speedUp() {
        this.currentSpeed += 10;
    }

    public void slowDown() {
        if(isStopped()){
            return;
        }
        this.currentSpeed -= 10;
    }

    public boolean isStopped() {
        return currentSpeed == 0;
    }

    @Override
    public String toString() {
        return "Hovercraft{" +
                "name='" + name + '\'' +
                ", currentSpeed=" + currentSpeed +
                ", motor=" + motor +
                '}';
    }
}
