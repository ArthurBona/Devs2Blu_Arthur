package Exe010_antigo02;

import java.util.Scanner;

public class Proprietario {
    private int id;
    private String nome;
    private String cpf;
    private static int contadorId;

    public Proprietario(String nome, String cpf) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static Proprietario cadastrarProprietario(Scanner scan){

        System.out.println("Nome do proprietário: ");
        scan.nextLine();
        String proprietario = scan.nextLine();

        System.out.println("CPF do proprietário: ");
        String cpf = scan.nextLine();

        return new Proprietario(proprietario, cpf);

    }
}

