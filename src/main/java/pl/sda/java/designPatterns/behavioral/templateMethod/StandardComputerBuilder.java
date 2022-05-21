package pl.sda.java.designPatterns.behavioral.templateMethod;

public class StandardComputerBuilder extends ComputerBuilder{

    @Override
    protected void addProcessor() {
        computerParts.put("processor", "standard procesor");
    }

    @Override
    protected void setupMotherboard() {
        System.out.println("setting mother board up");
    }

    @Override
    protected void addMotherboard() {
        computerParts.put("motherboard", "standard motherboard");
    }
}
