package pl.sda.java.designPatterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {


    @Test
    void shouldIterateOverNames() {
        Container stringContainer = new StringContainer();

        List<String> names = new ArrayList<>();
        for (Iterator<String> iter = stringContainer.getIterator(); iter.hasNext();) {
            String name = iter.next();
            names.add(name);
        }

        assertEquals(4, names.size());

        assertTrue(names.contains("Zofia"));
        assertTrue(names.contains("Stanisław"));
        assertTrue(names.contains("Antoni"));
        assertTrue(names.contains("Kazimierz"));
    }
}