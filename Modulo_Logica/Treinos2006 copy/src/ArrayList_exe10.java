import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_exe10 {
    static ArrayList<String> palavras = new ArrayList<>();
    public static void main(String[] args) {

        palavras.add("banana");
        palavras.add("computador");
        palavras.add("java");
        palavras.add("programa");
        palavras.add("palavra");

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        String palavraOriginal = palavras.get(rand.nextInt(palavras.size()));

        ArrayList<Character> letras = new ArrayList<>();

        for (char c : palavraOriginal.toCharArray()){
            letras.add(c);
        }

        Collections.shuffle(letras);

        System.out.println("Advinhe a palavra");
        for (Character letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println();

        System.out.println("Seu palpite: ");
        String palpite = scan.nextLine();

        if (palpite.equalsIgnoreCase(palavraOriginal)){
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Você errou, sinto muito!");
            System.out.println("A palavra correta era: " + palavraOriginal);
        }

        scan.close();
    }
}
