package Composite;

public abstract class Composant {
    public Composant(String name) {
        this.name = name;
    }

    protected String name;
    protected int level=0;

    public String tab(){
        String tabs = "";
        for (int i=0; i < this.level; i++){
            tabs += "\t";
        }
        return tabs;
    };

    public abstract void show();
}
