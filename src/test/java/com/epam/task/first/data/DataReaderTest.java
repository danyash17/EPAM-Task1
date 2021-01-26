package com.epam.task.first.data;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;


public class DataReaderTest {
    private static final String PATH="./src/test/resources/input.txt";
    private static final List<String> ACTUAL_INPUT =Arrays.asList("1 2 3 4 3 2 5 6 1 3 5","2k 4h 7k dg");
    @Test
    public void testDataReaderReadsFromInputTxtFile() throws DataException {
        DataException exception=Mockito.mock(DataException.class);
        //Filipp,how can i mock an exception here?
        DataReader reader=new DataReader();
        assertEquals(reader.readData(PATH).get(0),ACTUAL_INPUT.get(0));
        assertEquals(reader.readData(PATH).get(1),ACTUAL_INPUT.get(1));
    }
}
