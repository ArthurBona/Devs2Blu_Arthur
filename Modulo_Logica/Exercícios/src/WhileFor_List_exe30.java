import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileFor_List_exe30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> prices = new ArrayList<>();

        double price = 0;

        while (true){
            try {
                System.out.println("Enter the price of the bread");
                price = scan.nextDouble();

                if (price <= 0) {
                    System.out.println("The price must be a positive double");
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("The price must be a double");
                scan.nextLine();
            }
        }

        for (int i = 1; i < 51; i++){
            prices.add(price * i);
        }

        System.out.println("Tabela de preços: ");;

        for (int i = 0; i < prices.size(); i++) {
            System.out.printf("%d - %.2f\n", i + 1, prices.get(i));
        }
    }
}

