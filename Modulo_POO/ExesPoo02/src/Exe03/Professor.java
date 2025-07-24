package Exe03;

public class Professor {

    private int id;
    private String nome;
    private Disciplina disciplina;
    private static int contadorId;

    public Professor(String nome, Disciplina disciplina) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return nome + " - Disciplina: " + disciplina.getNome();
    }
}
