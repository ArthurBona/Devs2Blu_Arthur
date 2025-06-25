import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileFor_List_exe21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> factors = new ArrayList<>();

        int number;

        while (true){
            try {
                System.out.println("Type a positive integer");
                number = scan.nextInt();

                if (number < 1){
                    System.out.println("The number has to be positive");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid data type");
                scan.nextLine();
            }
        }

        if (number == 1){
            System.out.printf("%d is not prime", number);
            return;
        }

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                System.out.printf("%d is not prime", number);
                System.out.println();

                for (int j = 2; j < number; j++){
                    if (number % j == 0){
                        factors.add(j);
                    }
                }

                System.out.printf("%d is divisible per: \n", number);

                for (Integer factor : factors) {
                    System.out.print(factor + " ");
                }

                return;
            }
        }

        System.out.printf("%d is prime", number);

        scan.close();
    }
}

