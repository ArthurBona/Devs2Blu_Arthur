package Exe010_antigo02;

public class Marca {

    private int id;
    private String nome;
    private String nacionalidade;
    private static int contadorId;

    public Marca(String nome, String nacionalidade) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
