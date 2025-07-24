package Exe01;

import java.util.Scanner;

public class Documento {

    private int id;
    private String tipo;
    private String cpf;
    private static int contadorId;

    public Documento(String tipo, String cpf) {
        contadorId++;
        this.id = contadorId;
        this.tipo = tipo;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static Documento cadastrarDocumento(Scanner scan) {

        System.out.println("Tipo do documento: ");
        String tipo = scan.nextLine();

        System.out.println("CPF: ");
        String cpf = scan.nextLine();

        return new Documento(tipo, cpf);
    }

    @Override
    public String toString() {
        return "Documento: [tipo=" + tipo + ", cpf=" + cpf + "]";
    }
}
