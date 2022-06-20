package pl.sda.java.designPatterns.behavioral.command.command;

import lombok.AllArgsConstructor;
import pl.sda.java.designPatterns.behavioral.command.receiver.TextFile;

@AllArgsConstructor
public class OpenTextFileCommand implements TextFileCommand {

    private TextFile textFile;

    @Override
    public String execute() {
        return textFile.open();
    }
}
