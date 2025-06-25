import java.util.Scanner;

public class WhileFor_List_exe10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número inteiro");
        int num2 = scan.nextInt();

        int sum = 0;

        for (int i = num1 + 1; i < num2; i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }
}
