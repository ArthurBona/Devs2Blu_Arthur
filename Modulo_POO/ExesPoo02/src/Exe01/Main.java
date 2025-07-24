package Exe01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = Pessoa.cadastrarPessoa(scan);

        System.out.println(pessoa);

        scan.close();
    }
}
