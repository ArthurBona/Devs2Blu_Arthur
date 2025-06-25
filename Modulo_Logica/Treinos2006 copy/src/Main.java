//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(Cat.getCat_count());

        Cat cat1 = new Cat();
        cat1.name = "Missy";
        cat1.age = 5;
        cat1.meow();

        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getCat_count());

    }
}