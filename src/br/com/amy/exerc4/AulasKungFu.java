package br.com.amy.exerc4;

public class AulasKungFu {
    String dia;
    String mes;
    String ano;
    //    static int aulasPraticadas = 0;
    int aulasPraticadas = 0;

    public AulasKungFu() {
        aulasPraticadas++;
    }

    //    public static int quantidadeAulas(){
//        return AulasKungFu.aulasPraticadas;
//    }
    public int quantidadeAulas() {
        return aulasPraticadas;
    }

}
