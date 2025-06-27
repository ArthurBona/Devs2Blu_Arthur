import java.util.Scanner;

public class WhileFor_List_exe49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int n = scan.nextInt();

        double sum = 0.0;
        int denominador = 1;


        for (int i = 1; i <= n; i++){
            double termo = (double) i/denominador;
            sum += termo;

            System.out.print(i + "/" + denominador);
            if (i < n){
                System.out.print(" + ");
            }

            denominador += 2;

        }



        System.out.printf("\nSoma da série: %.4f\n", sum);

    }
}

