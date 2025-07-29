package br.com.amy.exerc21;

public class RelacionamentoMuitosParaMuitos {
    public static void main(String[] args) {
        var sensor1 = new Sensor(2332,true);
        var sensor2 = new Sensor(1221,true);
        var sensor3 = new Sensor(4334,true);
        var trigger1 = new Trigger("lights Off","Turn off all the hovercraft lights");
        var trigger2 = new Trigger("alert","fire hovercraft alert");
        var trigger3 = new Trigger("shield","turn on hovercraft shield");

        sensor1.addTrigger(trigger1);
        sensor1.addTrigger(trigger2);
        sensor2.addTrigger(trigger1);
        sensor2.addTrigger(trigger2);
        sensor3.addTrigger(trigger1);
        sensor3.addTrigger(trigger2);
        sensor3.addTrigger(trigger3);

        sensor1.detected = true;
        trigger1.shouldTrigger();
    }
}
