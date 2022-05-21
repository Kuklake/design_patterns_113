package pl.sda.java.designPatterns.behavioral.templateMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
@Getter
public class Computer {
    private Map<String, String> computerParts;
}
