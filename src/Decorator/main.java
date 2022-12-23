package Decorator;

public class main {
    public static void main(String[] args) {
        Boisson b1 = new B1();
        Boisson b2 = new B2();
        b1 = new Ingredient1(b1);
        b1 = new Ingredient2(b1);

        System.out.println(b1.getDescription());
        System.out.println(b1.cout());
        System.out.println(b2.getDescription());
        System.out.println(b2.cout());
    }
}
