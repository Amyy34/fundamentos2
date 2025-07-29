package com.o8k.academy;

public class Pessoa implements Humanoide{
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome.toUpperCase();
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getImc() {
        return this.peso / (this.altura * this.altura);
    }

    public boolean atributosNaoOk() {
        return this.nome.isBlank() || this.peso <= 0 || this.altura <= 0;
    }
}
