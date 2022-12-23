package Strategy;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Context context=new Context();
        context.doStrategy();
        context.setStrategy(new StrategyIMPL1());
        context.doStrategy();
        context.setStrategy(new StrategyIMPL2());
        context.doStrategy();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Donner le nom de la classe de la strategie: ");
            String strategyClassName = scanner.nextLine(); // has to be written like strategy.StrategyIMPL2 since its in the strategy package
            IStrategy strategy = (IStrategy) Class.forName(strategyClassName).getDeclaredConstructor().newInstance();
            context.setStrategy(strategy);
            context.doStrategy();
        }
    }
}
