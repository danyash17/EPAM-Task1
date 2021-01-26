package com.epam.task.first;

import com.epam.task.first.creator.ArrayCreator;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.logic.Array;

import java.util.List;

public class Main {
    public static void main(String[] args) throws DataException {
        ArrayValidator validator = new ArrayValidator();
        ArrayCreator creator = new ArrayCreator();
        DataReader reader = new DataReader();
        ArrayTransformer transformer = new ArrayTransformer(reader, validator, creator);
        List<Array> test = transformer.transform("./src/test/resources/input.txt");
        for(int i=0;i<test.size();i++){
            Array buff=test.get(i);
            buff.mergeSort();
            buff.print();
        }
    }
}
