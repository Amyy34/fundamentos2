package br.com.amy.exerc2;

public class Helicoptero {
    String modelo;
    String nome;
    boolean ligado;
    boolean motorLigado;

    public void ligar(){
        ligado = true;
        ligarMotor();
    }

    public void desligar() {
        ligado = false;
        desligarMotor();
    }

    private void ligarMotor(){
        motorLigado = true;
    }

    private void desligarMotor(){
        motorLigado = false;
    }

    public boolean transferirComoPilotar(String nome) {

        if (nome.isBlank()){
            System.out.println("O NOME NÃO PODE SER EM BRANCO");
            return false;
        }
        System.out.println("TRANSFERINDO CONHECIMENTO PARA => " + nome);
        return true;
    }

    public boolean transferirComoPilotar(String nomePessoa1,String nomePessoa2){

        if (nomePessoa1.isBlank() && nomePessoa2.isBlank()) {
            System.out.println("OS NOMES NÃO PODE SER EM BRANCO");
            return false;
        }
        System.out.println("TRANSFERINDO CONHECIMENTO PARA => " + nomePessoa1 + " E " + nomePessoa2);
        return true;
    }

    public void status(){
        System.out.println("MODELO => " + modelo);
        System.out.println("NOME => " + nome);
        System.out.println("ESTÁ LIGADO => " + ligado);
    }
}
