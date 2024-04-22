import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadProfessor lista = new ListaEncadProfessor();

        System.out.println("Digite os nomes dos professores (digite 'fim' para encerrar):");
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            lista.inserir(nome);
        }

        lista.exibirNomes();

        scanner.close();
    }
}
