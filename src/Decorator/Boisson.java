package Decorator;

public abstract class Boisson {
    protected String description;

    public String getDescription() {
        return description;
    }

    abstract public double cout();
}
