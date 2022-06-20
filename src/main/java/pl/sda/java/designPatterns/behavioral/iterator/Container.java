package pl.sda.java.designPatterns.behavioral.iterator;

public interface Container<T> {
    Iterator<T> getIterator();
}
