package TemplateMethod;

public class main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setTemplateClass(new Impl1());
        double resultat = client.operationTemplate("He");
        System.out.println(resultat);
    }
}
