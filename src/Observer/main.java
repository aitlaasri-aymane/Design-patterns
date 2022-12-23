package Observer;

public class main {
    public static void main(String[] args) {
        ObservableIMPL observable = new ObservableIMPL();
        IObserver observer1 = new ObserIMPL1();
        IObserver observer2 = new ObserIMPL2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setState(10);
        System.out.println("----------");
        observable.setState(20);
        System.out.println("----------");
        observable.setState(5);

        System.out.println("*****************************");
        observable.unsubscribe(observer1);

        observable.setState(90);
    }
}
