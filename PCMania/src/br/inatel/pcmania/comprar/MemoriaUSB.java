package br.inatel.pcmania.comprar;

public class MemoriaUSB {

    private String nome;
    private int capacidade;

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }
}
