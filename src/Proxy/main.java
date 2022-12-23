package Proxy;

public class main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStandard(new Proxy());
        client.operation();
    }
}
