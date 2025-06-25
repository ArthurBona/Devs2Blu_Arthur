import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite um número");
            numeros.add(scan.nextInt());
            sum += numeros.get(i);
        }

        System.out.println(sum/numeros.size());
    }
}
