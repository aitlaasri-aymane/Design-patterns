package Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableIMPL implements IObservable{
    private int state;
    private List<IObserver> observers=new ArrayList<>();
    @Override
    public void subscribe(IObserver observer) {
    observers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver observer) {
    observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        /*
        for(IObserver observer:observers){
            // Push technique
            observer.update(state);
        }
        */

        observers.forEach(observer -> {
            // Push technique
            //observer.update(state);
            // POP technique
            observer.updatePOPMethod(this);
        });

    }
    public void setState(int state) {
        this.state = state;
        // notify observers on each state change
        this.notifyObservers();
    }

    public int getState() {
        return state;
    }
}
