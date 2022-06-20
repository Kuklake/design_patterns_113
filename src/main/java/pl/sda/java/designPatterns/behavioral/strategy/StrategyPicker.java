package pl.sda.java.designPatterns.behavioral.strategy;

import java.time.LocalDate;
import java.time.Month;

public class StrategyPicker {

    public static Discounter chooseDiscounter(LocalDate date) {
        Month month = date.getMonth();

        Discounter discounter = new DefaultDiscounter();

        if (Month.DECEMBER.equals(month)) {
            discounter = new ChristmasDiscounter();
        }

        return discounter;
    }
}
