import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileFor_List_exe27 {
    public static void main(String[] args) {
        ArrayList<Integer> studentsPerClass = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int numClasses = 0;

        while (true) {

            try {

                System.out.println("Type the number of classes");
                numClasses = scan.nextInt();
                scan.nextLine();

                if (!positiveInt(numClasses)){
                    System.out.println("The number of classes must be a positive integer");
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("The number of classes must be an integer");
                scan.nextLine();
            }
        }

        for (int i = 0; i < numClasses; i++){

            while (true){
                try {
                    System.out.printf("Enter the number of students for class %d\n", i + 1);
                    int studentsNum = scan.nextInt();
                    scan.nextLine();

                    if (!positiveInt(studentsNum)) {
                        System.out.println("The number of students must be a positive integer");
                    } else if (studentsNum > 40) {
                        System.out.println("A class can not contain more than 40 students");
                    } else {
                        studentsPerClass.add(studentsNum);
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("The number of students must be an integer");
                    scan.nextLine();
                }
            }
        }

        int sumOfStudents = 0;

        for (Integer perClass : studentsPerClass) {
            sumOfStudents += perClass;
        }

        System.out.printf("The average number of students per class is %.2f", (double) sumOfStudents/studentsPerClass.size());

    }
    private static boolean positiveInt(int n){
        if (n <= 0){
            return false;
        } else {
            return true;
        }
    }
}