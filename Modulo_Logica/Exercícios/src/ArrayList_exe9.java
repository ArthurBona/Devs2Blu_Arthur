import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_exe9 {
    static ArrayList<Integer> guesses = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int gameNumber = rand.nextInt(100);
        int usersGuess;
        int tries = 0;

        while (true){
            try {
                System.out.println("Guess a number: ");
                usersGuess = scan.nextInt();
                tries++;
                guesses.add(usersGuess);

                if (usersGuess == gameNumber) {
                    System.out.println("You got it");
                    System.out.println("Number of tries: " + tries);
                    for (Integer guess : guesses) {
                        System.out.print(guess + " ");
                    }
                    break;
                } else if (usersGuess < gameNumber){
                    System.out.println("Game's number is greater");
                } else {
                    System.out.println("Game's number is smaller");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong data type, enter an integer");
                scan.nextLine();
            }
        }

        scan.close();
    }
}
