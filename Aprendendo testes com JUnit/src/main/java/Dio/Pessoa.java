package Dio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(){

    }

    public int getIdade() {
        return idade;
    }

    public boolean EhMaiorDeIdade() {
        return idade >= 18;
    }
}
