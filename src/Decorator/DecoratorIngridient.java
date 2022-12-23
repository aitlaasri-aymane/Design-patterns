package Decorator;

public abstract class DecoratorIngridient extends Boisson{
    protected Boisson boisson;

    public DecoratorIngridient(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();
}
