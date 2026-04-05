package br.inatel.pcmania.comprar;

public class Cliente {

    private String nome;
    private String cpf;

    private Computador[] compras = new Computador[10];

    public void setCompras(Computador[] compras) {
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public float calculaTotalCompra(){
        float total = 0;
        for(Computador comp : compras)
        {
            if(comp != null) {
                total += comp.getPreco();
            }
        }
        return total;
    }
}
