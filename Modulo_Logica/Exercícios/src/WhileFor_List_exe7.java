import java.util.ArrayList;
import java.util.Random;

public class WhileFor_List_exe7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++){
            numbers.add(rand.nextInt(100));
        }

        int biggest = 0;

        for (Integer number : numbers) {
            if (number > biggest){
                biggest = number;
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n" + biggest);
    }
}
