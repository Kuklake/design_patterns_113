package pl.sda.java.designPatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {

    @Test
    void shouldInitializeOnlyOnce() {

        ExpensiveObject o1 = new ExpensiveObjectProxy();
        ExpensiveObject o2 = new ExpensiveObjectProxy();

        o1.process();
        o1.process();
        o2.process();
        o2.process();

        assertEquals(1, ExpensiveObjectImpl.count);
    }
}