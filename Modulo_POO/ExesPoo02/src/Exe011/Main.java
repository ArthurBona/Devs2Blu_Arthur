package Exe011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Universidade USP = new Universidade();
        USP.adicionarAluno(EntradaDadosAluno.lerAluno(scan));
        USP.adicionarAluno(EntradaDadosAluno.lerAluno(scan));
        USP.adicionarAluno(EntradaDadosAluno.lerAluno(scan));

        int indice = EntradaDadosAluno.solicitarIndiceParaRemocao(scan, USP);
        if (indice != -1) USP.removerAluno(indice);

        USP.exibirAlunos();


        scan.close();

    }
}