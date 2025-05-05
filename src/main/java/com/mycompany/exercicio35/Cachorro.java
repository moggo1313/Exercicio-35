package com.mycompany.exercicio35;

public class Cachorro implements SerVivoeCia {

    private String nome;

    public Cachorro() {
        this("");
    }

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void produzirSom() {
        System.out.println("latir");
    }

    @Override
    public void mover() {
        System.out.println("caminhar (cachorro edition)");
    }

}
