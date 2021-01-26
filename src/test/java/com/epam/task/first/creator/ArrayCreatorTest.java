package com.epam.task.first.creator;

import static org.junit.jupiter.api.Assertions.*;
import com.epam.task.first.logic.Array;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayCreatorTest {
    private static final String INPUT="1 2 3";
    private static final List<Double> EXPECTED = Arrays.asList(1.0,2.0,3.0);
    @Test
    public void testCreatorCreatesCorrectArray(){
        ArrayCreator creator=new ArrayCreator();
        Array content=creator.create(INPUT);

        assertEquals(EXPECTED,content.getElements());
    }
}
