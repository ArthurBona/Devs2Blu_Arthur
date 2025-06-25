import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_exe7 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();

        System.out.println("Digite palavras (digite \"fim\"para encerrar)");

        while(true){
            String palavra = scan.nextLine().trim();
            palavra = palavra.toLowerCase();
            if (palavra.equals("fim")){
                break;
            } else if (!palavras.contains(palavra)){
                palavras.add(palavra);
            }
        }

        for (String palavra : palavras) {
            System.out.println(capitalize(palavra));

        }
    }

    private static String capitalize(String palavra){

        if (palavra == null || palavra.isEmpty()){
            return palavra;
        }

        String primeiraLetra = palavra.substring(0, 1).toUpperCase();
        String resto = palavra.substring(1).toLowerCase();

        return primeiraLetra + resto;
    }
}
