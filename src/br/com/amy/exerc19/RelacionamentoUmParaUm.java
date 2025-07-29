package br.com.amy.exerc19;

public class RelacionamentoUmParaUm {
    public static void main(String[] args) {
        var hovercraft = new Hovercraft("amycraft01");

        hovercraft.turnOn();
        hovercraft.speedUp();
        hovercraft.speedUp();

        System.out.println(hovercraft);

        hovercraft.slowDown();
        hovercraft.slowDown();
        hovercraft.slowDown();
        hovercraft.turnOff();

        System.out.println(hovercraft);
    }
}
