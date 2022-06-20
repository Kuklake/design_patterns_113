package pl.sda.java.designPatterns.behavioral.templateMethod;

public class HighEndComputerBuilder extends ComputerBuilder {
    @Override
    protected void addProcessor() {
        computerParts.put(ComputerPart.PROCESSOR, "super fast procesor");
    }

    @Override
    protected void setupMotherboard() {
        System.out.println("setting mother board for super computer");
    }

    @Override
    protected void addMotherboard() {
        computerParts.put(ComputerPart.MOTHER_BOARD, "high-end motherboard");
    }
}
