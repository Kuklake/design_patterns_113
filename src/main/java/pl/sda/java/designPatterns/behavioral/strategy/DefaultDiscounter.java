package pl.sda.java.designPatterns.behavioral.strategy;

import java.math.BigDecimal;

public class DefaultDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount;
    }
}