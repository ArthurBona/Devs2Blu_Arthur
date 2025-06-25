import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_exe8 {
    static ArrayList<String> tarefas = new ArrayList<>();
    static ArrayList<Integer> prioridades = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas tarefas e respectivas prioridades (digite \"fim\" para encerrar)");

        while (true){
            System.out.println("Digite sua tarefa");
            String tarefa = scan.nextLine();

            if (tarefa.equalsIgnoreCase("fim")){
                break;
            }

            tarefas.add(tarefa);

            System.out.println("Digite a prioridade");
            int prioridade = scan.nextInt();
            scan.nextLine();
            prioridades.add(prioridade);

        }

        if (prioridades.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        int maxValue = Collections.max(prioridades);

        for (int i = 0; i <= maxValue; i++) {
            for (int j = 0; j < prioridades.size(); j++) {
                if (prioridades.get(j) == i){
                    System.out.println("A tarefa " + tarefas.get(j) + " é de prioridade: " + i);
                }
            }
        }
    }
}
