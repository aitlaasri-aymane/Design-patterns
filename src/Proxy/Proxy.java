package Proxy;

import java.util.Random;

public class Proxy implements Standard{
    private StandardIMPL1 target;
    @Override
    public void operation() {
        System.out.println("verification...");
        boolean b = new Random().nextBoolean();
        target= new StandardIMPL1();
        if (b) {
            System.out.println("verification succeeded!");
            target.operation();
        }
        else
            System.out.println("verification failed!");
    }
}
