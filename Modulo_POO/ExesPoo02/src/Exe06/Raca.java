package Exe06;

import java.util.Scanner;

public class Raca {

    private int id;
    private String nome;
    private static int contadorId;

    public Raca(String nome) {
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

    public static Raca cadastrarRaca(Scanner scan) {
        System.out.print("Digite o nome da raça: ");
        String nome = scan.nextLine();
        return new Raca(nome);
    }

    @Override
    public String toString() {
        return "Raça #" + id + " | Nome: " + nome;
    }


}
