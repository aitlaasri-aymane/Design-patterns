package Decorator;

public class B1 extends Boisson{
    public B1() {
        description = "Espresso";
    }

    @Override
    public double cout() {
        return 6;
    }
}
