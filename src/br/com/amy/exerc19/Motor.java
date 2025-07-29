package br.com.amy.exerc19;

public class Motor {
    Integer serialNumber;
    String power = "2_0000CV";
    Boolean on;

    public Motor(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "serialNumber=" + serialNumber +
                ", power='" + power + '\'' +
                ", on=" + on +
                '}';
    }
}
