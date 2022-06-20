package pl.sda.java.designPatterns.behavioral.command.receiver;

public class TextFile {

    private final String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open(){
        return "opening file " + name;
    }

    public String save(){
        return "saving file " + name;
    }
}
