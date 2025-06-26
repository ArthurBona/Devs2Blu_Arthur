import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileFor_List_exe28 {
    public static void main(String[] args) {
        ArrayList<Double> cdPrices = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int numCDs = 0;

        while (true) {

            try {

                System.out.println("Type the number of CDs");
                numCDs = scan.nextInt();
                scan.nextLine();

                if (!positiveInt(numCDs)){
                    System.out.println("The number of CDs must be a positive integer");
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("The number of CDs must be an integer");
                scan.nextLine();
            }
        }

        for (int i = 0; i < numCDs; i++){

            while (true){
                try {
                    System.out.printf("Enter the price of CD number %d\n", i + 1);
                    double cdPrice = scan.nextDouble();
                    scan.nextLine();

                    if (!positiveInt(cdPrice)) {
                        System.out.println("The price of the CD must be a positive double");
                    } else {
                        cdPrices.add(cdPrice);
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("The price of the CD must be a double");
                    scan.nextLine();
                }
            }
        }

        double sumOfcdPrices = 0;

        for (Double cdPrice : cdPrices) {
            sumOfcdPrices += cdPrice;
        }

        System.out.printf("The average CD Price is %.2f", (double) sumOfcdPrices/ cdPrices.size());

    }
    private static boolean positiveInt(double n){
        if (n <= 0){
            return false;
        } else {
            return true;
        }
    }
}