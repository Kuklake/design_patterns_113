package pl.sda.java.designPatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void shouldUseChristmasDiscount() {
        LocalDate localDate = LocalDate.of(2002, 12, 5);
        Discounter discounter = StrategyPicker.chooseDiscounter(localDate);

        BigDecimal amountWithDiscount = discounter.applyDiscount(BigDecimal.valueOf(120));

        assertEquals(BigDecimal.valueOf(108d), amountWithDiscount);
    }

    @Test
    void shouldUseDefaultDiscount() {
        LocalDate localDate = LocalDate.of(2002, 2, 25);
        Discounter discounter = StrategyPicker.chooseDiscounter(localDate);

        BigDecimal amountWithDiscount = discounter.applyDiscount(BigDecimal.valueOf(120));

        assertEquals(BigDecimal.valueOf(120), amountWithDiscount);
    }
}