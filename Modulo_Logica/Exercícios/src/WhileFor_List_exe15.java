import java.util.Scanner;

public class WhileFor_List_exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos termos de Fibonacci você deseja? ");
        int nTerms = scan.nextInt();

        int n = 1;
        int m = 1;

        for (int i = 0; i < nTerms; i++){
            System.out.println(n);

            int proximo = n + m;
            n = m;
            m = proximo;

        }
    }
}
