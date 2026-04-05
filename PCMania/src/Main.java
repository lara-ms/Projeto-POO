import br.inatel.pcmania.sistema.SistemaCompra;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Bem-vindo a PC Mania, selecione a(s) promoção(ões) que deseja: ");

        SistemaCompra sistema = new SistemaCompra();

        sistema.inserirOpcoes();

        sistema.mostrarInfos();
    }

}
