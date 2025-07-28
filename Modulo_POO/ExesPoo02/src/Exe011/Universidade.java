package Exe011;

import java.util.ArrayList;

public class Universidade {

    private int id;
    private ArrayList<Aluno> alunos;
    private static int contadorId;

    public Universidade() {
        contadorId++;
        this.id = contadorId;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void exibirAlunos(){

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + " - " + alunos.get(i).getNome() + " - " + alunos.get(i).getMatricula());
        }

    }

    public void removerAluno(int indice){
        alunos.remove(alunos.get(indice));
    }

    public int getQuantidadeAlunos() {
        return alunos.size();
    }

}
