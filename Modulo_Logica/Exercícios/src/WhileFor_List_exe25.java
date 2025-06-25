import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ForWhile_List_exe25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        System.out.println("Digite as idades. Para encerrar, digite uma letra (ex: 'x').");

        while (true) {
            try {
                System.out.print("Digite a idade: ");
                int idade = scan.nextInt();

                if (idade <= 0) {
                    System.out.println("Idade deve ser um número inteiro positivo.");
                } else {
                    idades.add(idade);
                }

            } catch (InputMismatchException e) {
                String entrada = scan.next();
                System.out.println("Encerrando entrada de dados.");
                break;
            }
        }

        if (idades.isEmpty()) {
            System.out.println("Nenhuma idade válida foi inserida.");
            return;
        }

        int somaIdades = 0;
        for (Integer idade : idades) {
            somaIdades += idade;
        }

        double media = (double) somaIdades / idades.size();

        if (media <= 25) {
            System.out.println("Jovem");
        } else if (media <= 60) {
            System.out.println("Adulta");
        } else {
            System.out.println("Velha");
        }
    }
}
