import java.util.ArrayList;
import java.util.Random;

public class WhileFor_List_exe8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++){
            numbers.add(rand.nextInt(100));
        }

        int sum = 0;

        for (Integer number : numbers) {
            sum+= number;
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println(sum);
        System.out.println(sum/numbers.size());
    }
}
