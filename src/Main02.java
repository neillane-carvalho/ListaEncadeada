import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CursoAnalise curso = new CursoAnalise();

        // Menu de opções
        System.out.println("Bem-vindo ao sistema de matrícula do curso de Análise!");
        System.out.println("Escolha uma opção:");
        System.out.println("a) Adicionar aluno");
        System.out.println("b) Remover aluno");
        System.out.println("c) Pesquisar aluno");
        System.out.println("d) Listar alunos");
        System.out.println("s) Sair");

        // Loop principal do programa
        boolean sair = false;
        while (!sair) {
            System.out.print("Opção: ");
            String opcao = scanner.nextLine().toLowerCase();

            switch (opcao) {
                case "a":
                    System.out.print("Digite o número de matrícula do aluno: ");
                    int matriculaAdicionar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAdicionar = scanner.nextLine();
                    curso.adicionarAluno(matriculaAdicionar, nomeAdicionar);
                    break;
                case "b":
                    System.out.print("Digite o número de matrícula do aluno a ser removido: ");
                    int matriculaRemover = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado
                    curso.removerAluno(matriculaRemover);
                    break;
                case "c":
                    System.out.print("Digite o número de matrícula do aluno a ser pesquisado: ");
                    int matriculaPesquisar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado
                    curso.pesquisarAluno(matriculaPesquisar);
                    break;
                case "d":
                    curso.listarAlunos();
                    break;
                case "s":
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
