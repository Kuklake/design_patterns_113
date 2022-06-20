package pl.sda.java.designPatterns.behavioral.templateMethod;

public class StandardComputerBuilder extends ComputerBuilder{

    @Override
    protected void addProcessor() {
        computerParts.put(ComputerPart.PROCESSOR, "standard procesor");
    }

    @Override
    protected void setupMotherboard() {
        System.out.println("setting mother board for standard computer");
    }

    @Override
    protected void addMotherboard() {
        computerParts.put(ComputerPart.MOTHER_BOARD, "standard motherboard");
    }
}
