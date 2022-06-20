package pl.sda.java.designPatterns.behavioral.iterator;

public class StringIterator implements Iterator<String> {

    private String[] names;
    private int index;

    public StringIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public String next() {
        String next = this.hasNext() ? names[index++] : null;
        return next;
    }
}