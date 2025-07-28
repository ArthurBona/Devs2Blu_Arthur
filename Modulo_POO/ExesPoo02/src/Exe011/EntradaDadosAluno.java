package Exe011;

import java.util.Scanner;

public class EntradaDadosAluno {

    public static Aluno lerAluno(Scanner scan) {
        System.out.println("*** CADASTRO DE ALUNO ***");
        System.out.println("Nome do aluno:");
        String nome = scan.nextLine();
        System.out.println("Matrícula do aluno:");
        String matricula = scan.nextLine();
        return new Aluno(nome, matricula);
    }

    public static int solicitarIndiceParaRemocao(Scanner scan, Universidade universidade) {
        int indice = -1;

        universidade.exibirAlunos();
        System.out.print("Informe o número do aluno a remover: ");

        try {
            indice = Integer.parseInt(scan.nextLine()) - 1;
            if (indice < 0 || indice >= universidade.getQuantidadeAlunos()) {
                System.out.println("Índice inválido. Nenhum aluno será removido.");
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Nenhum aluno será removido.");
            return -1;
        }

        return indice;
    }

}

