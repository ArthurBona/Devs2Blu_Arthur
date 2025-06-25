import java.util.Scanner;

public class WhileFor_List_exe12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("De qual número você gostaria de ver a tabuada? ");
        int num = scan.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.printf("%d X %d = %d\n", num, i, num*i);
        }

    }
}
