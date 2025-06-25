public class WhileFor_List_exe16 {
    public static void main(String[] args) {
        int n = 0;
        int m = 1;

        while (m < 500){
            System.out.println(m);
            int proximo = n + m;
            n = m;
            m = proximo;
        }
    }
}
