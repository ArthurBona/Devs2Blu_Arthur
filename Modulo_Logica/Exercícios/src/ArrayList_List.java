import java.util.ArrayList;

public class ArrayList_List {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(11);
        numeros.add(13);
        numeros.add(17);
        numeros.add(19);
        numeros.add(23);

        int terceiro = numeros.get(2);
        numeros.set(1, 42);
        numeros.add(7);
        numeros.removeFirst();
        numeros.indexOf(42);

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Morango");
        frutas.add("Uva");
        frutas.add("Abacaxi");

        frutas.remove("Banana");
        frutas.contains("Morango");

        int sum = 0;
        for (Integer numero : numeros) {
            System.out.println(numero);
            sum += numero;
        }

        System.out.println(sum);




    }
}
