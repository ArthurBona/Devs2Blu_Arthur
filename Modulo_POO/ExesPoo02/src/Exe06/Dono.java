package Exe06;

import java.util.Scanner;

public class Dono {

    private int id;
    private String nome;
    private static int contadorId;

    public Dono(String nome) {
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

    public static Dono cadastrarDono(Scanner scan){

        System.out.println("Nome do dono: ");
        String dono = scan.nextLine();

        return new Dono(dono);

    }

    @Override
    public String toString() {
        return "Dono #" + id + " | Nome: " + nome;
    }

}
