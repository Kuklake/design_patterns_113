package pl.sda.java.designPatterns.behavioral.templateMethod;

import java.util.Map;

public class HighEndComputer extends Computer{
    public HighEndComputer(Map<ComputerPart, String> computerParts) {
        super(computerParts);
    }
}
