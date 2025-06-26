import java.util.ArrayList;

public class WhileFor_List_exe29 {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();

        for (int i = 1; i < 51; i++){
            prices.add(1.99 * i);
        }

        System.out.println("Tabela de preços: ");;

        for (int i = 0; i < prices.size(); i++) {
            System.out.printf("%d - %.2f\n", i + 1, prices.get(i));
        }
    }
}
