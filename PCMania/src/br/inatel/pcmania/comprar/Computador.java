package br.inatel.pcmania.comprar;

public class Computador {

    private String marca;
    private float preco;

    HardwareBasico[] hardware;
    SistemaOperacional sistema;

    MemoriaUSB memoria;

    public float getPreco() {
        return preco;
    }

    public Computador(String marca, float preco, HardwareBasico[] hardware, String nome, int tipo) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.sistema = new SistemaOperacional(nome, tipo);
    }

    public void mostraPCConfigs(){
        System.out.println("    - Marca: "+marca);
        System.out.println("    - Preço: "+preco);
        System.out.println("    - Hardware Básico: ");
        for(HardwareBasico hard : hardware) {
            System.out.println("      - Nome: " + hard.getNome());
            System.out.print("        Capacidade: " + hard.getCapacidade());
            if((hard.getNome() == "Memoria Ram") || (hard.getNome() == "HD")){
                System.out.println(" (Gb)");
            } else {
                System.out.println(" (Mhz)");
            }
        }
        System.out.println("    - Sistema Operacional: ");
        System.out.println("      - Nome: " + sistema.getNome());
        System.out.println("        Tipo: " + sistema.getTipo() + " (bits)");
        if(memoria != null){
            System.out.println("    - Memória USB:");
            System.out.println("      - Nome: " + memoria.getNome());
            System.out.println("        Capacidade: " + memoria.getCapacidade() + " (Gb)");

        }

    }

    public void addMemoriaUSB(MemoriaUSB musb){
        memoria = musb;
    }

}
