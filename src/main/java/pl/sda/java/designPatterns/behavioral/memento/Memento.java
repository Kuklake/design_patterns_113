package pl.sda.java.designPatterns.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Memento {
    private State state;
}
