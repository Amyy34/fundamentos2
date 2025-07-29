package br.com.amy.exerc12;

public class Pessoa {
    String nome;
    String sobrenome;

    public Pessoa(String nome, String novoNome){
        this.nome = nome;
        this.sobrenome = novoNome;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Pessoa){
            Pessoa outraPessoa = (Pessoa) o;
            return this.nome.equalsIgnoreCase(outraPessoa.nome) && this.sobrenome.equalsIgnoreCase(outraPessoa.sobrenome);
        }
        return false;
    }
}
