package pl.sda.java.designPatterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Originator {

    private State state;

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }
}