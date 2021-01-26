package com.epam.task.first;

import static org.junit.jupiter.api.Assertions.*;
import com.epam.task.first.creator.ArrayCreator;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.logic.Array;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
public class ArrayTransformerTest {
    private final static List<String> TEST_DATA= Arrays.asList("1 2 3 4 5","1g 3h 5jk");
    private final static Array<Double> EXPECTED_ARRAY=new Array<Double>(1.0,2.0,3.0,4.0,5.0);
    private final static List<Double> EXPECTED_DOUBLES =Arrays.asList(1.0,2.0,3.0,4.0,5.0);
    @Test
    public void testTransformTxtFileWithStringsToArrayList() throws DataException {

        DataReader reader= Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);
        ArrayValidator validator= Mockito.mock(ArrayValidator.class);
        when(validator.validate(TEST_DATA.get(0))).thenReturn(true);
        when(validator.validate(TEST_DATA.get(1))).thenReturn(false);
        ArrayCreator creator=Mockito.mock(ArrayCreator.class);
        when(creator.create(TEST_DATA.get(0))).thenReturn(EXPECTED_ARRAY);

        ArrayTransformer transformer=new ArrayTransformer(reader,validator,creator);
        List<Array> actual= transformer.transform("ANYTHING");
        assertEquals(actual.get(0).getElements(), EXPECTED_DOUBLES);
    }
}
