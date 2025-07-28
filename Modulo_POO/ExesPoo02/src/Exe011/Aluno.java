package Exe011;

public class Aluno {

    private int id;
    private String nome;
    private String matricula;
    private static int contadorId;

    public Aluno(String nome, String matricula) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
