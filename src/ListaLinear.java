public class ListaLinear {
    private static final int TAMANHO_MAXIMO = 7;
    private int[] lista;
    private int tamanho;

    public ListaLinear() {
        this.lista = new int[TAMANHO_MAXIMO];
        this.tamanho = 0;
    }

    public boolean estaCheia() {
        return tamanho == TAMANHO_MAXIMO;
    }

    public void inserirInicio(int numero) {
        if (!estaCheia()) {
            for (int i = tamanho; i > 0; i--) {
                lista[i] = lista[i - 1];
            }
            lista[0] = numero;
            tamanho++;
            System.out.println("Número " + numero + " inserido no início da lista.");
        } else {
            System.out.println("A lista está cheia. Não é possível inserir mais elementos.");
        }
    }

    public void inserirFim(int numero) {
        if (!estaCheia()) {
            lista[tamanho] = numero;
            tamanho++;
            System.out.println("Número " + numero + " inserido no fim da lista.");
        } else {
            System.out.println("A lista está cheia. Não é possível inserir mais elementos.");
        }
    }

    public void exibirLista() {
        System.out.println("Lista:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }


}
