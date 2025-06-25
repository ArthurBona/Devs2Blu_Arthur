import java.util.ArrayList;
import java.util.Scanner;

public class IntegersReader {
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite um número inteiro: ");
        numbers.add(scan.nextInt());

       while(true){
           try {
               System.out.println("1-Novo\n2-Sair\nOpção: ");

               switch (scan.nextInt()){
                   case 1:
                       System.out.println("Digite um novo número: ");
                       numbers.add(scan.nextInt());
                       break;
                   case 2:
                       System.out.println(numbers);
                       System.exit(0);
                       break;
                   default:
                       System.out.println("Opção inválida");
               }

           } catch (Exception e){
               System.out.println("Erro de entrada, tente novamente");
           }
       }
    }
}
