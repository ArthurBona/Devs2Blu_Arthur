package Exe03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Escola {

    private int id;
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;
    private static int contadorId;

    public Escola(String nome, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.professores = professores;
    }


    public void cadastrarDisciplina(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Disciplina: ");
        String nome = scan.nextLine();

        disciplinas.add(new Disciplina(nome));
    }

    public void cadastrarProfessor(){
        Scanner scan = new Scanner(System.in);

        System.out.println("nome");
        String nome = scan.nextLine();

        System.out.println("Selecione a disciplina do professor:");
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println((i + 1) + " - " + disciplinas.get(i).getNome()) ;
        }

        System.out.println("Digite o número da disciplina: ");
        int op = scan.nextInt();
        scan.nextLine();

        Disciplina disciplina = disciplinas.get(op - 1);
        Professor professor = new Professor(nome, disciplina);
        professores.add(professor);
    }

}
