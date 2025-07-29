package br.com.amy.exerc17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SobreMap {
    public static void main(String[] args) {
        var tripulantes = new HashMap<Integer,String>();
        tripulantes.put(1,"Morpheus");
        tripulantes.put(2,"Trinity");
        tripulantes.put(3,"Cypher");
        tripulantes.put(4,"Neo");

        System.out.println("O TAMANHO DO MAP É" + tripulantes.size());
        System.out.println("A MAP ESTÁ VAZIO?" + tripulantes.isEmpty());
        System.out.println("AS CHAVES DO MAP SÃ0:" + tripulantes.keySet());
        System.out.println("OS VALORES DO MAP SÃO:" + tripulantes.values());
        System.out.println("AS CHAVES E OS VALORES DO MAP SÃO:" + tripulantes.entrySet());
        System.out.println("O MAP TEM A CHAVE COM VALOR 10?" + tripulantes.containsKey(10));
        System.out.println("O MAP TEM O VALOR NEO?" + tripulantes.containsValue("Neo"));
        System.out.println("O TRIPULANTE DE CHAVE 2 É:" + tripulantes.get(2));

        tripulantes.put(2,"Tank");

        for (var chave : tripulantes.keySet()){
            System.out.println(chave);
        }

        for (var value : tripulantes.values()){
            System.out.println(value);
        }

        for (var keyAndValue : tripulantes.entrySet()){
            System.out.println(keyAndValue);
        }

        var carros = new HashMap<String, List<String>>();
        carros.put("Ferrari", Arrays.asList("carro1","carro2"));

        System.out.println(carros);
    }
}
