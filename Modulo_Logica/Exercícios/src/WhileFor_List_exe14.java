import java.util.Scanner;

public class WhileFor_List_exe14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro: ");
            int numero = scan.nextInt();

            if ((numero % 2) == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("A quantidade de pares é: " + pares);
        System.out.println("A quantidade de impares é: " + impares);
    }
}
