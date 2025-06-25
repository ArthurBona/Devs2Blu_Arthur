import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class WhileFor_List_exe4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean repetir = true;

        do{

            double popA = 0;
            double popB = 0;
            double rateA = 0;
            double rateB = 0;

            while(true){
                System.out.println("Enter population A");
                popA = scan.nextDouble();
                scan.nextLine();

                if (popA <= 0){
                    System.out.println("The population should be a positive number");
                } else {
                    break;
                }
            }

            while(true){
                System.out.println("Enter population B");
                popB = scan.nextDouble();
                scan.nextLine();

                if (popB < 0){
                    System.out.println("The population should be a positive number");
                } else if (popB < popA){
                    System.out.println("Population A is bigger than population B already");
                    System.out.println("Enter a new value");
                } else {
                    break;
                }
            }

            while(true){
                System.out.println("Enter rate A");
                rateA = scan.nextDouble();
                scan.nextLine();

                if (rateA <= 0 || rateA > 1){
                    System.out.println("The rate must be between 0 and 1");
                } else {
                    break;
                }
            }

            while(true){
                System.out.println("Enter rate B");
                rateB = scan.nextDouble();
                scan.nextLine();

                if (rateB < 0 || rateB > 1){
                    System.out.println("The rate must be between 0 and 1");
                } else if (rateB >= rateA) {
                    System.out.println("Population A is never going to surpass population B");
                    System.out.println("Enter a new rate");
                } else {
                    break;
                }
            }

            int yearsToPass = 0;

            while (popA < popB){
                popA = popA * (1 + rateA);
                popB = popB * (1 + rateB);
                yearsToPass++;
            }

            System.out.println(yearsToPass);

            System.out.println("Do your want to repeat the operation? Y or N");
            if (!scan.nextLine().equalsIgnoreCase("y")){
                repetir = false;
            }

        } while (repetir);
    }
}
