import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaLinear lista = new ListaLinear();

        System.out.println("Bem-vindo! Escolha uma opção:");
        System.out.println("1) Inserir número no início da lista");
        System.out.println("2) Inserir número no fim da lista");
        System.out.println("3) Exibir lista");
        System.out.println("0) Sair");

        boolean sair = false;
        while (!sair) {
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o número a ser inserido no início da lista: ");
                    int numeroInicio = scanner.nextInt();
                    lista.inserirInicio(numeroInicio);
                    break;
                case 2:
                    System.out.print("Digite o número a ser inserido no fim da lista: ");
                    int numeroFim = scanner.nextInt();
                    lista.inserirFim(numeroFim);
                    break;
                case 3:
                    lista.exibirLista();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

}
