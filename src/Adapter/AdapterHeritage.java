package Adapter;

public class AdapterHeritage extends NeedsToAdapt implements Standard {
    @Override
    public void operation(double nb1, double nb2) {
        double p=product(nb1,nb2);
        show(p);
    }
}
