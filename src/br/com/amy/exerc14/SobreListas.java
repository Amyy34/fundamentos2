package br.com.amy.exerc14;

import java.util.ArrayList;

public class SobreListas {
    public static void main(String[] args) {
        var naves = new ArrayList<Nave>();
        naves.add(new Nave("Avatar"));
        naves.add(new Nave("Icarus"));
        naves.add(new Nave("Logos"));
        naves.add(new Nave("Nebuchadnezzar"));

        System.out.println(naves.get(2).nome);

        for(var nave:naves){
            System.out.println(nave.nome);
        }

        naves.remove(0);
        naves.remove(new Nave("Icarus"));
        naves.removeIf(nave -> nave.nome.equals("Logos"));

        System.out.println("--------------------------");

        for(var nave:naves){
            System.out.println(nave.nome);
        }

        System.out.println(naves.contains(new Nave("Nebuchadnezzar")));

        naves.clear();

        System.out.println(naves);
    }
}
