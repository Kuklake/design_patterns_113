package pl.sda.java.designPatterns.behavioral.mediator;

public class Mediator {

    protected static final String MSG_PREFIX = "I love you, but ";

    public static String accommodate(String msg) {
        return MSG_PREFIX + msg;
    }
}
