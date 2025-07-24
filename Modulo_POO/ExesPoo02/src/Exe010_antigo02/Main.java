package Exe010_antigo02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Marca> marcas = new ArrayList<>();

        marcas.add(new Marca("Ferrari", "Italiana"));
        marcas.add(new Marca("Volkswagen", "Alemã"));
        marcas.add(new Marca("Ford", "Estadunidense"));

        Carro carro1 = Carro.cadastrarCarro(scan, marcas);
        carro1.exibirInformacoes();

    }
}