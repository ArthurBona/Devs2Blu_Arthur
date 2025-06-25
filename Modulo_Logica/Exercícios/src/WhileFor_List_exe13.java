import java.util.Scanner;

public class WhileFor_List_exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int base = scan.nextInt();

        System.out.println("Enter the power: ");
        int power = scan.nextInt();

        int result = 1;

        for (int i = 0; i < power; i++){
            result *= base;
        }

        System.out.println(result);
    }
}
