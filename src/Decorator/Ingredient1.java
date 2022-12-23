package Decorator;

public class Ingredient1 extends DecoratorIngridient{

    public Ingredient1(Boisson boisson) {
        super(boisson);
        description="Ingredient 1";
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " avec " + this.description;
    }

    @Override
    public double cout() {
        return 4+boisson.cout();
    }
}
