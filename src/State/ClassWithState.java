package State;

public class ClassWithState {
    private State state;

    public ClassWithState() {
        this.state = new StateA(this);
    }

    public void operationStateA(){state.operationStateA();}
    public void operationStateB(){state.operationStateB();}
    public void operationStateC(){state.operationStateC();}
    public void doAction(){state.doAction();}

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
