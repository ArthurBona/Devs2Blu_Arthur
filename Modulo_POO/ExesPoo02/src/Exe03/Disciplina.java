package Exe03;

public class Disciplina {

    private int id;
    private String nome;
    private static int contadorId;

    public Disciplina(String nome) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
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

    @Override
    public String toString() {
        return nome;
    }
}
