import java.util.Locale;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaProfessores lista = new ListaProfessores();

        System.out.println("Escolha uma opção:");
        System.out.println("a) Adicionar professor");
        System.out.println("b) Remover professor");
        System.out.println("c) Verificar tamanho da lista");
        System.out.println("d) Verificar se a lista está vazia");
        System.out.println("e) Apagar lista");
        System.out.println("f) Listar professores");
        System.out.println("s) Sair");

        boolean sair = false;
        while (!sair){
            System.out.println("Opção: ");
            String opcao = scanner.nextLine().toLowerCase();

            switch (opcao){
                case "a":
                    System.out.print("Digite o nome do professor a ser adicionado: ");
                    String nomeAdicionar = scanner.nextLine();
                    lista.adicionar(nomeAdicionar);
                    break;
                case "b":
                    System.out.print("Digite o nome do professor a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    lista.remover(nomeRemover);
                    break;
                case "c":
                    System.out.println("Tamanho da lista: " + lista.verificarTamanho());
                    break;
                case "d":
                    System.out.println("A lista está vazia? " + lista.estaVazia());
                    break;
                case "e":
                    lista.apagarLista();
                    System.out.println("Lista apagada.");
                    break;
                case "f":
                    lista.listar();
                    break;
                case "s":
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}