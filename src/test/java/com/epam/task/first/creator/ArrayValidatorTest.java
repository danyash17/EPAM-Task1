package com.epam.task.first.creator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayValidatorTest {
    private final String CORRECT="1 2 3 4 5";
    private final String INCORRECT="1k 2h i3";
    @Test
    public void testValidatorTakesCorrectLines(){
        ArrayValidator validator=new ArrayValidator();
        assertTrue(validator.validate(CORRECT));
        assertFalse(validator.validate(INCORRECT));
    }
}
