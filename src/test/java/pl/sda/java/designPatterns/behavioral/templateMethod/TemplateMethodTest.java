package pl.sda.java.designPatterns.behavioral.templateMethod;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {

    @Test
    void shouldBuildStandardComputer() {
        ComputerBuilder computerBuilder = new StandardComputerBuilder();

        Computer computer = computerBuilder.buildComputer();

        Map<ComputerPart, String> computerParts = computer.getComputerParts();
        assertEquals("standard motherboard", computerParts.get(ComputerPart.MOTHER_BOARD));
        assertEquals("standard procesor", computerParts.get(ComputerPart.PROCESSOR));
    }

    @Test
    void shoildBuildHighEndComputer() {
        ComputerBuilder computerBuilder = new HighEndComputerBuilder();

        Computer computer = computerBuilder.buildComputer();

        Map<ComputerPart, String> computerParts = computer.getComputerParts();
        assertEquals("super fast procesor", computerParts.get(ComputerPart.PROCESSOR));
        assertEquals("high-end motherboard", computerParts.get(ComputerPart.MOTHER_BOARD));
    }
}