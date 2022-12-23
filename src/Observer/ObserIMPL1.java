package Observer;

public class ObserIMPL1 implements IObserver{
    private int lastState;
    @Override
    public void update(int state) {
        if(state-lastState > 0)
        System.out.println("Observer1 => Pressure went UP to " + state);
        else if(state-lastState < 0)
        System.out.println("Observer1 => Pressure went DOWN to " + state);
        else
        System.out.println("Observer1 => Pressure hasnt changed still " + state);
        lastState = state;
    }

    @Override
    public void updatePOPMethod(IObservable observable) {
        int state = ((ObservableIMPL)observable).getState();
        if(state-lastState > 0)
            System.out.println("Observer1 => Pressure went UP to " + state);
        else if(state-lastState < 0)
            System.out.println("Observer1 => Pressure went DOWN to " + state);
        else
            System.out.println("Observer1 => Pressure hasnt changed still " + state);
        lastState = state;
    }
}
