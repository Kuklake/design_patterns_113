package pl.sda.java.designPatterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {
    @Test
    void shouldSaveSequenceOfStates() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState(State.NOT_READY);
        originator.setState(State.PREPARING); // 1
        careTaker.add(originator.save());
        originator.setState(State.READY); //2
        careTaker.add(originator.save());
        originator.setState(State.CANCELED);
        State currentState = originator.getState(); //canceled
        originator.restore(careTaker.get(0)); //preparing
        State firstSavedState = originator.getState();
        originator.restore(careTaker.get(1)); // ready
        State secondSavedState = originator.getState();

        assertEquals(State.CANCELED, currentState);
        assertEquals(State.PREPARING, firstSavedState);
        assertEquals(State.READY, secondSavedState);
        assertTrue(careTaker.getAllStates().contains(State.PREPARING));
        assertTrue(careTaker.getAllStates().contains(State.READY));
    }
}