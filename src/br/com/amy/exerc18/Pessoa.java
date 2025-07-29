package br.com.amy.exerc18;

import java.util.Objects;

public class Pessoa {
    String nome;
    String sobrenome;

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    @Override

    public boolean equals(Object o){
        if(o instanceof Pessoa){
            Pessoa outraPessoa = (Pessoa) o;
            return this.nome.equalsIgnoreCase(outraPessoa.nome) && this.sobrenome.equalsIgnoreCase(outraPessoa.sobrenome);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }
}
