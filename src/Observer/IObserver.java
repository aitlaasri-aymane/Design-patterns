package Observer;

public interface IObserver {
    void update(int state);
    void updatePOPMethod(IObservable observable);
}
