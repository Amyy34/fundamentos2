package br.com.amy.exerc20;

public class RelacionamentoUmPraMuitos {
    public static void main(String[] args) {
        var hovercraft1 = new Hovercraft("Amycraft01");
        System.out.println(hovercraft1);
        hovercraft1.sensoresOff();
        System.out.println(hovercraft1);
        hovercraft1.sensorOnByIndex(1);
        System.out.println(hovercraft1);
    }
}
