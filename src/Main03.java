import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("Digite 15 números inteiros para inserir na lista:");
        for (int i = 0; i < 15; i++) {
            int numero = scanner.nextInt();
            lista.inserir(numero);
        }

        lista.percorrerLista();

        scanner.close();
    }
}
