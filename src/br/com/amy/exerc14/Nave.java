package br.com.amy.exerc14;

import java.util.Objects;

public class Nave {
    String nome;

    public Nave(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Objects.equals(nome, nave.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
