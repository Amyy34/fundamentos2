package br.com.amy.desafioFinal;

public class Pessoa implements Humanoide{
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public double GetImc() {
        return peso/(altura*altura);
    }

    @Override
    public String GetNome() {
        return nome;
    }

    public boolean AtributosNaoOk(){
         return nome.isBlank() || peso <= 0 || altura <= 0;
    }
}
