package Adapter;

public class NeedsToAdapt {
    public void show(double product){
        System.out.println("Old product method : "+product);
    }
    public double product(double n1,double n2){
        return n1*n2;
    }
}
