package br.com.amy.exerc5;

import java.time.LocalDateTime;

public class ValorVsReferencia {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        x = y;
        x+=50;
        System.out.println(x);
        System.out.println(y);

        LocalDateTime data = LocalDateTime.now();
        System.out.println(data);
        LocalDateTime data2 = data;

        System.out.println(data2);

        data2 = data2.plusDays(2);
        System.out.println(data);
        System.out.println(data2);
    }
}
