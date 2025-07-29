package br.com.amy.exerc22;

public class Treinamento {
    private String nome;

    public void addName(String nome){
        if (nome.isBlank()){
            System.out.println("O nome não pode ser em branco");
            return;
        }
        this.nome = nome.trim().toUpperCase();
    }

    @Override
    public String toString() {
        return "Treinamento{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
