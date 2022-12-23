package Adapter;

public class AdapterComposition implements Standard {
    NeedsToAdapt needsToAdapt = new NeedsToAdapt();

    @Override
    public void operation(double nb1, double nb2) {
        double p=needsToAdapt.product(nb1,nb2);
        needsToAdapt.show(p);
    }
}
