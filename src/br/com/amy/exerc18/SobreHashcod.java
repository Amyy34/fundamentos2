package br.com.amy.exerc18;

import java.util.HashSet;

public class SobreHashcod {
    public static void main(String[] args) {
        var pessoas = new HashSet<Pessoa>();
        var joao = new Pessoa("João","Ferrreira");
        var amy = new Pessoa("Amy Lee","Souza");

        pessoas.add(joao);
        pessoas.add(new Pessoa("Maria","José"));
        pessoas.add(amy);
        var amy2 = new Pessoa("Amy Lee","Souza");

//        System.out.println(pessoas.contains(amy2));
//        System.out.println(joao.hashCode());

        System.out.println(amy.hashCode());
        System.out.println(amy2.hashCode());
    }
}
