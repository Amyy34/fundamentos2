package br.com.amy.exerc13;

import java.util.HashSet;
import java.util.TreeSet;

public class SetHomogeneo {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Estou aprendendo sobre conjunto");
        conjunto.add("Conjunto é muito legal");
        conjunto.add("Este é um conjunto homogeneo");
        conjunto.add("Pode armazenar valores apenas de um tipo determinado");
//      conjunto.add(2);

        for(String frase : conjunto){
            System.out.println(frase);
        }

        var inteiros = new TreeSet<Integer>();
        inteiros.add(6);
        inteiros.add(7);
        inteiros.add(8);

        System.out.println(inteiros);

    }
}
