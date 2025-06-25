import java.util.*;

public class WhileFor_List_exe18 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true){
            try {

                System.out.println("Enter an integer between 0 and 1000 (Enter -1 to stop)");
                int number = scan.nextInt();

                if (number == -1){
                    break;
                } else {
                    numbers.add(number);
                }

                if (number < 0 || number > 1000){
                    System.out.println("Invalid entry");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid data type");
                scan.nextLine();
            }
        }

        int maxValue = Collections.max(numbers);
        int minValue = Collections.min(numbers);
        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(sum);

    }
}
