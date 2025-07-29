package br.com.amy.exerc27_2;

import br.com.amy.exerc27.Hovercraft;

public class ModificadoresDeAcesso2 {
    public static void main(String[] args) {
        var hovercraft2 = new Hovercraft2("AmyXRT2");

        System.out.println(hovercraft2.protectedChannel1021()); // protected passa por herança.
        System.out.println(hovercraft2.publicChannel1010());

        var hovercraft = new Hovercraft("RamonXTR");
        System.out.println(hovercraft.publicChannel1010());
    }

}


