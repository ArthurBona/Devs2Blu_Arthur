public class Cat {

    public static final int MAX_LIVES = 9;
    private static int cat_count = 0;

    String name;
    int age;
    int livesRemaining;

    public void meow(){
        System.out.println("meowwwww");
    }

    public Cat(){
        cat_count++;
        livesRemaining = MAX_LIVES;
    }

    public static int getCat_count(){
        return cat_count;
    }

}
