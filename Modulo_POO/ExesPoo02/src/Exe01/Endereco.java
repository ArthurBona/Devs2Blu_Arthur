package Exe01;

import java.util.Scanner;

public class Endereco {

    private int id;
    private String cidade;
    private String rua;
    private int numero;
    private static int contadorId;

    public Endereco(String cidade, String rua, int numero) {
        contadorId++;
        this.id = contadorId;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static Endereco cadastrarEndereco(Scanner scan) {

        System.out.println("Cidade: ");
        String cidade = scan.nextLine();

        System.out.println("Rua: ");
        String rua = scan.nextLine();

        System.out.println("Número: ");
        int numero = scan.nextInt();
        scan.nextLine();

        return new Endereco(cidade, rua, numero);
    }

    @Override
    public String toString() {
        return "Endereço: [município de " + cidade + ", rua " + rua + ", número " + numero;
    }
}
