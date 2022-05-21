package pl.sda.java.designPatterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public static int count;

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
        count++;
    }

    private void heavyInitialConfiguration() {
        System.out.println("loading configuration");
    }

    @Override
    public String process() {
        return "processing completed";
    }
}
