package Exe01;

import java.util.Scanner;

public class Pessoa {

    private int id;
    private String nome;
    private Documento documento;
    private Endereco endereco;
    private static int contadorId;

    public Pessoa(String nome, Documento documento, Endereco endereco) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
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

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static Pessoa cadastrarPessoa(Scanner scan) {

        System.out.println("Nome: ");
        String nome = scan.nextLine();

        Documento doc = Documento.cadastrarDocumento(scan);
        Endereco end = Endereco.cadastrarEndereco(scan);

        return new Pessoa(nome, doc, end);
    }

    @Override
    public String toString() {
        return "Pessoa: [id=" + id + ", nome=" + nome + ", " + documento + ", " + endereco + "]";
    }

}
