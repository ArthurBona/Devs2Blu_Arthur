import java.util.Scanner;

public class WhileFor_List_exe17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){

            int numero;

            do {
                System.out.println("Digite um número inteiro entre 0 e 16");
                numero = scan.nextInt();
            } while (numero < 0 || numero >= 16);

            int fatorial = 1;

            for (int i = numero; i > 0; i--){
                fatorial *= i;
            }

            System.out.println(fatorial);
            System.out.println("Gostaria de calcular novo fatorial? Y/N");

            char resposta = scan.next().charAt(0);

            if (Character.toUpperCase(resposta) == 'N'){
                continuar = false;
            }
        }
    }
}
