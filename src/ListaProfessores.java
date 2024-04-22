import java.util.ArrayList;

public class ListaProfessores {
    private ArrayList<String> professores;

    public ListaProfessores(){
        this.professores = new ArrayList<>();
    }

    public void adicionar(String nomeProfessor){
        professores.add(nomeProfessor);
    }

    public void remover(String nomeProfessor){
        professores.remove(nomeProfessor);
    }

    public int verificarTamanho(){
        return professores.size();
    }

    public boolean estaVazia(){
       return professores.isEmpty();
    }

    public void apagarLista(){
        professores.clear();
    }

    public void listar(){
        System.out.println("PROFESSORES DO CURSO DE ANÁLISE DA UCSAL");
        for (String professor : professores){
            System.out.println("- " + professor);
        }
    }
}
