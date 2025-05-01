package br.com.amy.exerc1;

public class HelicopteroTeste {
    public static void main(String[] args) {
        Helicoptero helicoptero1 = new Helicoptero();
        helicoptero1.modelo = "B212";
        helicoptero1.nome = "Bell 212";
        Helicoptero helicoptero2 = new Helicoptero();
        helicoptero2.modelo = "Esquilo";
        helicoptero2.nome = "H 125";
        helicoptero2.ligado = true;

        System.out.println("MODELO 1 => " + helicoptero1.modelo);
        System.out.println("NOME 1 => " + helicoptero1.nome);
        System.out.println("ESTÁ LIGADO => " + helicoptero1.ligado);
        System.out.println("MODELO 2 => " + helicoptero2.modelo);
        System.out.println("NOME 2 => " + helicoptero2.nome);
        System.out.println("ESTÁ LIGADO => " + helicoptero2.ligado);
    }
}
