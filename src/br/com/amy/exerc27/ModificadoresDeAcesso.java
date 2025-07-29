package br.com.amy.exerc27;

public class ModificadoresDeAcesso {
    public static void main(String[] args) {
        var hovercraft = new Hovercraft("AmyTXR");
        System.out.println(hovercraft.publicChannel1010());
        System.out.println(hovercraft.packageChannel4056());
        System.out.println(hovercraft.protectedChannel1021());
//      System.out.println(hovercraft.privateChannel06());
    }
}
