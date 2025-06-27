import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileFor_List_exe33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int temperaturesCount = 0;
        double biggestTemp = Double.MIN_VALUE;
        double smallestTemp = Double.MAX_VALUE;

        while (true) {
            try {
                System.out.println("Enter a temperature (type a letter to end the program)");
                double temperature = scan.nextDouble();

                if (temperature > biggestTemp) {
                    biggestTemp = temperature;
                }
                if (temperature < smallestTemp){
                    smallestTemp = temperature;
                }

                sum += temperature;
                temperaturesCount++;

            } catch (InputMismatchException e) {
                break;
            }
        }

        if (temperaturesCount > 0) {
            System.out.printf("The biggest temperature is %.2f%n", biggestTemp);
            System.out.printf("The smallest temperature is %.2f%n", smallestTemp);
            System.out.printf("The average temperature is %.2f%n", sum/temperaturesCount);
        } else {
            System.out.println("No temperatures were provided");
        }

        scan.close();
    }
}
