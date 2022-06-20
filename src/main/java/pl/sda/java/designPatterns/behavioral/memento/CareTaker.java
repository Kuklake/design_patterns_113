package pl.sda.java.designPatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int i){
        return mementoList.get(i);
    }

    public List<State> getAllStates() {
        List<State> states = mementoList.stream()
                .map(m -> m.getState())
                .collect(Collectors.toList());
        return states;
    }

}
