import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CursoAnalise curso = new CursoAnalise();

        // Adiciona alguns alunos para teste
        curso.adicionarAluno(1001, "Maria");
        curso.adicionarAluno(1002, "João");
        curso.adicionarAluno(1003, "Ana");

        System.out.print("Digite o número de matrícula do aluno a ser buscado: ");
        int matriculaBuscar = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado
        Aluno alunoEncontrado = curso.buscarAluno(matriculaBuscar);
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado:");
            System.out.println("Matrícula: " + alunoEncontrado.getMatricula());
            System.out.println("Nome: " + alunoEncontrado.getNome());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
