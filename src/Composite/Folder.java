package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant{
    private List<Composant> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }


    /*
     public void add(Composant composant){
        composant.level=this.level+1;
        children.add(composant);
    }
    */

    public Composant add(Composant composant){
        composant.level=this.level+1;
        children.add(composant);
        return composant;
    }

    public void remove(Composant composant){
        children.remove(composant);
    }
    public List<Composant> getChildren() {
        return children;
    }

    @Override
    public void show() {
        System.out.println(tab() + "Folder : " + this.name);
        if(!children.isEmpty())
            this.getChildren().forEach(composant -> composant.show());
    }
}
