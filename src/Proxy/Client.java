package Proxy;

public class Client {
    Standard standard;

    public void operation(){
        standard.operation();
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}