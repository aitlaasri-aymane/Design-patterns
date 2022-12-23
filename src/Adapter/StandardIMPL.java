package Adapter;

public class StandardIMPL implements Standard{
    @Override
    public void operation(double nb1, double nb2) {
        System.out.println("Standard Impl : "+ (nb1*nb2));
    }
}
