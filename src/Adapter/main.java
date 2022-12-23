package Adapter;

public class main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setStandard(new AdapterComposition());
        //client.setStandard(new StandardIMPL());
        //client.setStandard(new AdapterHeritage());
        //client.setStandard(new AdapterComposition());
        client.treatment(5,2);
    }
}
