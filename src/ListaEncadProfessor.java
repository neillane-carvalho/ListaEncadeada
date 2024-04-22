public class ListaEncadProfessor {
    private NoProfessor primeiro;

    public ListaEncadProfessor(){
        this.primeiro = null;
    }

    public void inserir(String nome) {
        NoProfessor novoNoh = new NoProfessor(nome);
        if (primeiro == null) {
            primeiro = novoNoh;
        } else {
            NoProfessor atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNoh;
        }
    }

    public void exibirNomes() {
        NoProfessor atual = primeiro;
        System.out.println("Professores armazenados na lista:");
        while (atual != null) {
            System.out.println(atual.nome);
            atual = atual.proximo;
        }
    }
}
