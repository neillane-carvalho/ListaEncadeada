public class ListaEncadeada {
    private No primeiro;

    public void inserir(int numero) {
        No novoNoh = new No(numero);
        if (primeiro == null) {
            primeiro = novoNoh;
        } else {
            No atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNoh;
        }
    }

    public void percorrerLista() {
        No atual = primeiro;
        int posicao = 1;
        System.out.println("Posição dos números na lista:");
        while (atual != null) {
            System.out.println("Número: " + atual.valor + ", Posição: " + posicao);
            atual = atual.proximo;
            posicao++;
        }
    }
}
