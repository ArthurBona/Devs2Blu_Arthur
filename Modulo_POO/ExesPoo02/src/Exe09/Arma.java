package Exe09;

import java.util.Scanner;

public class Arma {

    private int id;
    private String nome;
    private int dano;
    private String tipo;
    private static int contadorId;

    public Arma(String nome, int dano, String tipo) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.dano = dano;
        this.tipo = tipo;
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

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static Arma cadastrarArma(Scanner scan) {

        System.out.println("Nome da arma: ");
        String nome = scan.nextLine();

        System.out.println("Dano da arma: ");
        int dano = scan.nextInt();
        scan.nextLine();

        System.out.println("Tipo da arma (ex: Espada, Cajado, Arco...): ");
        String tipo = scan.nextLine();

        return new Arma(nome, dano, tipo);
    }
}
