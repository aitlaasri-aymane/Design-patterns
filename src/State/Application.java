package State;

public class Application {
    public static void main(String[] args) {
        ClassWithState classWithState = new ClassWithState();
        classWithState.doAction();
        classWithState.operationStateA();
        classWithState.doAction();
        classWithState.operationStateC();
        classWithState.doAction();
        classWithState.operationStateB();
        classWithState.operationStateB();
        classWithState.doAction();
        classWithState.operationStateA();
        classWithState.doAction();
        classWithState.operationStateC();
        classWithState.doAction();
        classWithState.operationStateB();
        classWithState.doAction();
        classWithState.operationStateC();
        classWithState.doAction();
        classWithState.operationStateC();
        classWithState.operationStateA();
        classWithState.doAction();
    }
}
