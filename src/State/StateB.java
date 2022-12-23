package State;

public class StateB extends State {
    public StateB(ClassWithState classWithState) {
        super(classWithState);
    }

    @Override
    public void operationStateA() {
        System.out.println("Impossible to go from B -> A");
    }

    @Override
    public void operationStateB() {
        System.out.println("Already state B");
    }

    @Override
    public void operationStateC() {
        classWithState.setState(new StateC(classWithState));
        System.out.println("Changing state B -> C");
    }

    @Override
    public void doAction() {
        System.out.println("State is : B");
    }
}
