public class ListaSimpEncad {
    private NoSimpEcand primeiro;

    public ListaSimpEncad() {
        this.primeiro = null;
    }

    public void inserir(int numero) {
        NoSimpEcand novoNoh = new NoSimpEcand(numero);
        if (primeiro == null) {
            primeiro = novoNoh;
        } else {
            novoNoh.proximo = primeiro;
            primeiro = novoNoh;
        }
    }

    public boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void exibirNumerosPrimos() {
        NoSimpEcand atual = primeiro;
        System.out.println("Números primos na lista:");
        while (atual != null) {
            if (ehPrimo(atual.valor)) {
                System.out.println(atual.valor);
            }
            atual = atual.proximo;
        }
    }
}

