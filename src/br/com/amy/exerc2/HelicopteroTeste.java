package br.com.amy.exerc2;

public class HelicopteroTeste {
    public static void main(String[] args) {
        Helicoptero helicoptero = new Helicoptero();
        helicoptero.modelo = "B212";
        helicoptero.nome = "Bell 212";
        helicoptero.ligar();
        helicoptero.status();
        var transferindoParaRamon = helicoptero.transferirComoPilotar("Ramon");
        System.out.println("Transferido com sucesso para Ramon? " + transferindoParaRamon);
        var transferindoParaDuasPessoas = helicoptero.transferirComoPilotar("Ramon","Alessandra");
        System.out.println("Transferido com sucesso para Ramon e Alessandra? " + transferindoParaDuasPessoas );
    }
}

