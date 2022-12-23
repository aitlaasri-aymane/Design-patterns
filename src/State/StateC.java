package State;

public class StateC extends State {
    public StateC(ClassWithState classWithState) {
        super(classWithState);
    }

    @Override
    public void operationStateA() {
        classWithState.setState(new StateA(classWithState));
        System.out.println("Changing from C -> A");
    }

    @Override
    public void operationStateB() {
        classWithState.setState(new StateB(classWithState));
        System.out.println("Changing from C -> B");
    }

    @Override
    public void operationStateC() {
        System.out.println("Already state C");
    }

    @Override
    public void doAction() {
        System.out.println("State is : C");
    }
}
