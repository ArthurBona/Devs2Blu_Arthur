import java.util.ArrayList;

public class WhileFor_List_exe9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 50; i++){
            numbers.add(i + 1);
            if (((i + 1) % 2) == 1){
                System.out.print(i + 1 + " ");
            }
        }
    }
}
