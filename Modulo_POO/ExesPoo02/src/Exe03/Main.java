package Exe03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();

        Escola escola = new Escola("Escola Municipal ABC", disciplinas, professores);

        escola.cadastrarDisciplina();
        escola.cadastrarDisciplina();

        escola.cadastrarProfessor();
        escola.cadastrarProfessor();

        System.out.println("\n--- Disciplinas Cadastradas ---");
        for (Disciplina d : disciplinas) {
            System.out.println("ID: " + d.getId() + " - " + d.getNome());
        }

        System.out.println("\n--- Professores Cadastrados ---");
        for (Professor p : professores) {
            System.out.println("ID: " + p.getId() + " - " + p.getNome() + " - Disciplina: " + p.getDisciplina().getNome());
        }
    }
}
