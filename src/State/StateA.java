package State;

public class StateA extends State {
    public StateA(ClassWithState classWithState) {
        super(classWithState);
    }

    @Override
    public void operationStateA() {
        System.out.println("Already state A");
    }

    @Override
    public void operationStateB() {
        classWithState.setState(new StateB(classWithState));
        System.out.println("Changing from state A -> B");
    }

    @Override
    public void operationStateC() {
        System.out.println("Impossible to change from A -> C");
    }

    @Override
    public void doAction() {
        System.out.println("State is : A");
    }
}
