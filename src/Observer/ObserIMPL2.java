package Observer;

public class ObserIMPL2 implements IObserver{
    private int somme;
    @Override
    public void update(int state) {
        somme += state;
        System.out.println("Observer2 recieved state change  so somme=" + somme);
    }

    @Override
    public void updatePOPMethod(IObservable observable) {
        int state = ((ObservableIMPL)observable).getState();
        somme += state;
        System.out.println("Observer2 recieved state change  so somme=" + somme);
    }
}
