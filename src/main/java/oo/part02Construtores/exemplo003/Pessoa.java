package oo.part02Construtores.exemplo003;

public class Pessoa {

    public Pessoa(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
