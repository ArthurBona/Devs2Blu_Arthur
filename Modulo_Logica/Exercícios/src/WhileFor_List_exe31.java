import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class WhileFor_List_exe31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Tabajara Store");

            int numProduct = 1;
            double total = 0.0;

            while (true) {

                System.out.print("Product " + numProduct + ": R$ ");
                double price = scan.nextDouble();

                if (price == 0) {
                    break;
                } else if (price <= 0) {
                    System.out.println("Invalid price. The price should be a positive integer");
                    continue;
                }

                total += price;
                numProduct++;

            }

            System.out.printf("Total: R$%.2f\n", total);

            double money = 0.0;

            while (true){
                System.out.print("Money: R$ ");
                money = scan.nextDouble();

                if (money < total) {
                    System.out.println("Unsufficient money. Try again.");
                } else {
                    break;
                }
            }

            double change = money - total;
            System.out.printf("Change: R$ %.2f\n", change);

            System.out.print("\nDo you wish to register a new purchase? (y/n): ");
            scan.nextLine();
            String answer = scan.nextLine().trim().toLowerCase();

            if (!answer.equals("y")) {
                System.out.println("Finishing system");
                break;
            }
        }
        scan.close();
    }
}

