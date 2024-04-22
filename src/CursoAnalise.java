import java.util.ArrayList;

public class CursoAnalise {
    private ArrayList<Aluno> alunos;

    public CursoAnalise() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(int matricula, String nome) {
        Aluno aluno = new Aluno(matricula, nome);
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void removerAluno(int matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getMatricula() == matricula) {
                alunos.remove(i);
                System.out.println("Aluno removido com sucesso!");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void pesquisarAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                System.out.println("Aluno encontrado:");
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome());
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

//   METODO BUSCAR RECURSIVO
    public Aluno buscarAluno(int matricula) {
        return buscarAlunoRecursivo(matricula, 0);
    }

    private Aluno buscarAlunoRecursivo(int matricula, int indice) {
        if (indice >= alunos.size()) {
            return null; // Não encontrou o aluno
        }
        if (alunos.get(indice).getMatricula() == matricula) {
            return alunos.get(indice); // Encontrou o aluno
        }
        return buscarAlunoRecursivo(matricula, indice + 1); // Chama recursivamente para o próximo aluno
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Não há alunos matriculados.");
        } else {
            System.out.println("Lista de alunos matriculados:");
            for (Aluno aluno : alunos) {
                System.out.println("Matrícula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome());
            }
        }
    }
}
