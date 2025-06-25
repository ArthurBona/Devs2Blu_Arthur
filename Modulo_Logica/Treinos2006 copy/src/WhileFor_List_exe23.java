import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileFor_List_exe23 {
    static Integer divsCount = 0;
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int n;

        while(true){
            try {
                System.out.println("Enter a positive integer");
                n = scan.nextInt();

                if (n < 1) {
                    System.out.println("The integer must be positive");
                }
                else {
                    break;
                }

            } catch (InputMismatchException e){
                System.out.println("Invalid data type");
                scan.nextLine();
            }
        }

        for (int i = 2; i <= n; i++){
            if (primeVerify(i)) {
                primes.add(i);
            }
        }

        System.out.println("\nNúmeros primos entre 1 e " + n + ":");
        for (Integer prime : primes) {
            System.out.print(prime + " ");
        }

        System.out.println("\nNúmero de divisões realizadas: " + divsCount);

        scan.close();

    }

    private static boolean primeVerify(int i) {
        if (i == 2) return true;
        if (i % 2 == 0) {
            divsCount++;
            return false;
        }

        int limit = (int) Math.sqrt(i);
        for (int j = 3; j <= limit; j += 2) {
            divsCount++;
            if (i % j == 0) return false;
        }

        return true;
    }
}
