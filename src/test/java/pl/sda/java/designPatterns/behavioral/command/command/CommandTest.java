package pl.sda.java.designPatterns.behavioral.command.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.java.designPatterns.behavioral.command.receiver.TextFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandTest {

    private final String PODANIE = "podanie";
    private final TextFile textFile = new TextFile(PODANIE);

    @Test
    void shouldOpenTextFile() {
        TextFileCommand openCommand = new OpenTextFileCommand(textFile);

        String commandExecuted = openCommand.execute();

        assertEquals("opening file " + PODANIE, commandExecuted);
    }

    @Test
    void shouldSaveTextFile() {
        TextFileCommand saveCommand = new SaveTextFileCommand(textFile);

        String commandExecuted = saveCommand.execute();

        assertEquals("saving file " + PODANIE, commandExecuted);
    }
}