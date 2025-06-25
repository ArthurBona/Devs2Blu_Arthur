import java.util.ArrayList;
import java.util.Scanner;

public class StringsList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Digite uma fruta:");
        words.add(scan.next());

        boolean continuar = true;

        while(continuar){
            System.out.println("=====Menu=====\nNOVA - DIGITAR PALAVRA\nFIM - ENCERRAR LISTA\n==============\nOpção: ");
            String opção = scan.next();
            if (opção.equalsIgnoreCase("NOVA")){
                System.out.println("Digite nova fruta");
                words.add(scan.next());
            } else if (opção.equalsIgnoreCase("FIM")) {
                continuar = false;
            } else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Lista: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(Capitalize(words.get(i)));
        }
    }

    public static String Capitalize(String word){
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }
}
