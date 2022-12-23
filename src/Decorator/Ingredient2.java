package Decorator;

public class Ingredient2 extends DecoratorIngridient{

    public Ingredient2(Boisson boisson) {
        super(boisson);
        description="Ingredient 2";
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " avec " + this.description;
    }

    @Override
    public double cout() {
        return 1.5+boisson.cout();
    }
}
