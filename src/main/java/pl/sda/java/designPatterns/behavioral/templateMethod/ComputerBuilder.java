package pl.sda.java.designPatterns.behavioral.templateMethod;

import java.util.HashMap;
import java.util.Map;

public abstract class ComputerBuilder {

    protected Map<String, String> computerParts = new HashMap<>();

    public final Computer buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return new Computer(computerParts);
    }

    protected abstract void addProcessor();

    protected abstract void setupMotherboard();

    protected abstract void addMotherboard();
}