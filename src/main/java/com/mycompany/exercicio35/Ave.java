package com.mycompany.exercicio35;

public class Ave implements SerVivoeCia {

    private String nome;

    public Ave() {
        this("");
    }

    public Ave(String nome) {
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
        System.out.println("piar");
    }

    @Override
    public void mover() {
        System.out.println("caminhar (passarinho edition)");
    }

}
