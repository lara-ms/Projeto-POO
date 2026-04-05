package br.inatel.pcmania.comprar;

public class SistemaOperacional {

    private String nome;
    private int tipo;

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
