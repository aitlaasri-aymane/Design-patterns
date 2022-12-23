package Decorator;

public class B2 extends Boisson{
    public B2() {
        description="Coffe";
    }

    @Override
    public double cout() {
        return 3;
    }
}
