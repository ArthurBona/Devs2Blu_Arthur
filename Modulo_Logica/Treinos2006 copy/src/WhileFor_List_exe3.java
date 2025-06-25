import java.util.Scanner;

public class WhileFor_List_exe3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        Double wage;
        char gender;
        char civilSituation;

        while (true){
            System.out.println("Enter your name");
            name = scan.next();
            if (name.length() <= 3){
                System.out.println("Your name must have more than 3 letters");
            }
            else{
                break;
            }
        }

        while (true){
            System.out.println("Enter your age");
            age = scan.nextInt();
            if (age < 0 || age > 150){
                System.out.println("Your age must be between 0 and 150 years");
            }
            else{
                break;
            }
        }

        while (true){
            System.out.println("Enter your wage");
            wage = scan.nextDouble();
            if (wage < 0){
                System.out.println("Your wage must be bigger than 0$");
            }
            else{
                break;
            }
        }

        while (true){
            System.out.println("Enter your gender");
            gender = scan.next().charAt(0);
            if (gender != 'f' && gender != 'm'){
                System.out.println("Your gender must be m(male) or f(female)");
            }
            else{
                break;
            }
        }

        while (true){
            System.out.println("Enter your Civil Situation");
            civilSituation = scan.next().charAt(0);
            if (civilSituation != 's' && civilSituation != 'c' && civilSituation != 'v' && civilSituation != 'd'){
                System.out.println("Your civil situation should be \n's' or \n'c' or \n'v' or \n'd'");
            }
            else{
                break;
            }
        }
        System.out.println(name);
        System.out.println(age);
        System.out.println(wage);
        System.out.println(gender);
        System.out.println(civilSituation);
    }
}
