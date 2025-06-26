import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileFor_List_exe26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> candidates = new ArrayList<>();
        ArrayList<Integer> votes = new ArrayList<>();
        votes.add(0);
        votes.add(0);
        votes.add(0);
        candidates.add("Victor Hugo");
        candidates.add("Alexandre");
        candidates.add("Dante");

        int voters_number = 0;

        while (true){
            try {

                System.out.println("Enter the number of voters: ");
                voters_number = scan.nextInt();
                scan.nextLine();

                if (voters_number <= 0) {
                    System.out.println("The number of voters must be a positive integer");
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("The number must be an integer");
                scan.nextLine();
            }
        }

        for (int i = 0; i < voters_number; i++){
            printCandidates(candidates);

            while (true){
                try {
                    System.out.println("Type the index of your choice's candidate: ");
                    int indexOfCandidate = scan.nextInt();
                    scan.nextLine();

                    if (indexOfCandidate < 0){
                        System.out.println("The index must be a non negative integer");
                    } else {
                        votes.set(indexOfCandidate, votes.get(indexOfCandidate) + 1);
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("The index must be an integer");
                    scan.nextLine();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("There is no candidate with this index");
                    scan.nextLine();
                }
            }
        }

        for (int i = 0; i < candidates.size(); i++) {
            System.out.printf("Candidate %s got %d votes\n", candidates.get(i), votes.get(i));
        }

    }

    private static void printCandidates(ArrayList candidates){
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(i + " " + candidates.get(i));
        }
    }
}

