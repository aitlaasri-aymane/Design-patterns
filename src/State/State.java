package State;

public abstract class State {
    protected ClassWithState classWithState;

    public State(ClassWithState classWithState) {
        this.classWithState = classWithState;
    }

    public abstract void operationStateA();
    public abstract void operationStateB();
    public abstract void operationStateC();
    public abstract void doAction();
}
