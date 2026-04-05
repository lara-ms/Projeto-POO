package br.inatel.pcmania.sistema;

import br.inatel.pcmania.comprar.Cliente;
import br.inatel.pcmania.comprar.Computador;
import br.inatel.pcmania.comprar.HardwareBasico;

import java.util.Scanner;

public class SistemaCompra {

    private Cliente cliente = new Cliente("135.246.987-00", "Lara");
    private Computador[] compras = new Computador[10];

    private Computador op1, op2, op3;

    public SistemaCompra() {
        addPromo();
    }

    private void addPromo(){
        // PROMOCAO 01
        HardwareBasico[] hard1 = new HardwareBasico[3];
        hard1[0] = new HardwareBasico("Pentium Core i3", 2200);
        hard1[1] = new HardwareBasico("Memoria Ram", 8);
        hard1[2] = new HardwareBasico("HD", 500);

        op1 = new Computador("Apple", 2365, hard1, "mcOS Sequoia", 64);

        // PROMOCAO 02
        HardwareBasico[] hard2 = new HardwareBasico[3];
        hard2[0] = new HardwareBasico("Pentium Core i5", 3370);
        hard2[1] = new HardwareBasico("Memoria Ram", 16);
        hard2[2] = new HardwareBasico("HD", 1000);

        op2 = new Computador("Samsung", 3599, hard2, "Windows 8", 64);

        // PROMOCAO 03
        HardwareBasico[] hard3 = new HardwareBasico[3];
        hard3[0] = new HardwareBasico("Pentium Core i7", 4500);
        hard3[1] = new HardwareBasico("Memoria Ram", 32);
        hard3[2] = new HardwareBasico("HD", 2000);

        op3 = new Computador("Dell", 8043, hard3, "Windows 10", 64);

    }

    private void menu(){
        System.out.println("");
        System.out.println("Opcões em promoção:");
        System.out.println("[ 1 ] Apple");
        System.out.println("[ 2 ] Samsung");
        System.out.println("[ 3 ] Dell");
        System.out.println("[ 0 ] Finalizar compra");
        System.out.print("-> Opção: ");
    }

    public void inserirOpcoes(){

        Scanner entrada = new Scanner((System.in));

        int opcao;
        do{
            menu();
            opcao = entrada.nextInt();
            if(opcao == 1){
                adicionaCarrinho(op1);
            } else if(opcao == 2){
                adicionaCarrinho(op2);
            } else if(opcao == 3){
                adicionaCarrinho(op3);
            }
        } while(opcao != 0);

        cliente.setCompras(compras);
        ProcessarPedido.pedido(compras);

        entrada.close();
    }

    private void adicionaCarrinho(Computador computador){
        for(int i = 0; i < compras.length; i++){
            if(compras[i] == null){
                compras[i] = computador;
                break;
            }
        }
    }

    public void mostrarInfos(){
        System.out.println("");
        System.out.println("-> Informações Cliente: ");
        System.out.println("    - Nome : "+cliente.getNome());
        System.out.println("    - CPF : "+cliente.getCpf());

        System.out.println("-> Informações Compra: ");
        int i = 0;
        for(Computador comp : compras) {
            if(comp != null) {
                System.out.println("  * " + (i + 1) + "º PC: ");
                comp.mostraPCConfigs();
                i++;
            } else{
                break;
            }
        }

        System.out.println("-> Preço Final: R$"+cliente.calculaTotalCompra());
    }

}
