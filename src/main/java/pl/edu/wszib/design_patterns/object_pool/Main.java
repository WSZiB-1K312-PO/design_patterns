package pl.edu.wszib.design_patterns.object_pool;

public class Main {
    public static void main(String[] args) {
        /*String a = "test";
        String b = "test";
        String c = new String("test");

        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println(a.equals(c));
        System.out.println(a == c);*/

        Fruit orange = Fruit.create("Orange");
        Fruit secondOrange = Fruit.create("Orange");

        System.out.println(orange.equals(secondOrange));
        System.out.println(orange == secondOrange);
    }
}
