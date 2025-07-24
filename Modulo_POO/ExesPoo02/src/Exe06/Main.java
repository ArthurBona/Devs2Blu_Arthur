package Exe06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Raca> racas = new ArrayList<>();

        racas.add(new Raca("Golden Retriever"));
        racas.add(new Raca("Border Collier"));
        racas.add(new Raca("Pastor belga"));

        Cao cao = Cao.cadastrarCao(scan ,racas);

        System.out.println(cao);

    }
}
