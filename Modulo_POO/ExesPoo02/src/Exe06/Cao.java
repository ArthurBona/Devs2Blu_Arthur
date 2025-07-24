package Exe06;

import java.util.ArrayList;
import java.util.Scanner;

public class Cao {

    private int id;
    private String nome;
    private Raca raca;
    private Dono dono;
    private static int contadorId;

    public Cao(String nome, Raca raca, Dono dono) {
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.raca = raca;
        this.dono = dono;
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

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public static Cao cadastrarCao(Scanner scan, ArrayList<Raca> racas){

        System.out.println("Nome: ");
        String cao = scan.nextLine();

        Dono dono = Dono.cadastrarDono(scan);

        System.out.println("Selecione a raça do cão: ");
        for (int i = 0; i < racas.size(); i++) {
            System.out.println((i + 1) + " - " + racas.get(i).getNome());
        }

        System.out.println("Digite o número da raça");
        int op = scan.nextInt();
        scan.nextLine();

        Raca raca = racas.get(op - 1);
        return new Cao(cao, raca, dono);
    }

    @Override
    public String toString() {
        return "Cão #" + id +
                " | Nome: " + nome +
                ", Raça: " + raca.getNome() +
                ", Dono: " + dono.getNome();
    }

}
