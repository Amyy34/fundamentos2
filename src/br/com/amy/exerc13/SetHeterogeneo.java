package br.com.amy.exerc13;

import java.util.HashSet;

public class SetHeterogeneo {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(2);
        conjunto.add(false);
        conjunto.add('a');
        System.out.println(conjunto.size());
        conjunto.remove('a');
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains(10));

        HashSet numeros = new HashSet<Integer>();
        numeros.add(2);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);

        conjunto.addAll(numeros);

        System.out.println("O resultado da união do conjunto com numeros é: " + conjunto);

        HashSet inteiros = new HashSet<Integer>();
        inteiros.add(2);
        inteiros.add(5);

        conjunto.retainAll(inteiros);
        System.out.println("O resultado da intersecção do conjunto com inteiros é: " + conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
