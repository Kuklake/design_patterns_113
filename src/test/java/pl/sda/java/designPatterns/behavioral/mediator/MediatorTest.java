package pl.sda.java.designPatterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    @Test
    void wifeShouldLoveHerusband() {
        String msgText = "you are so distant!";
        Spouse wife = new Spouse("Marry", Role.WIFE);

        String msgSent = wife.sendMsg(msgText);

        assertEquals(Mediator.MSG_PREFIX + msgText, msgSent);
    }

    @Test
    void husbandShouldLoveHisWife() {
        String msgText = "you talk too much!";
        Spouse husband = new Spouse("John", Role.HUSBAND);

        String msgSent = husband.sendMsg(msgText);

        assertEquals(Mediator.MSG_PREFIX + msgText, msgSent);
    }
}