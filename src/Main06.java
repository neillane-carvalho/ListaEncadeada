import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimpEncad lista = new ListaSimpEncad();

        System.out.println("Digite pelo menos 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            lista.inserir(numero);
        }

        lista.exibirNumerosPrimos();

        scanner.close();
    }
}
