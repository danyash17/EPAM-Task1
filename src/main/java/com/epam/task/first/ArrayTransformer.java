package com.epam.task.first;

import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.creator.ArrayCreator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.logic.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTransformer {

    private DataReader reader;
    private ArrayCreator creator;
    private ArrayValidator validator;

    public ArrayTransformer(DataReader reader, ArrayValidator validator, ArrayCreator creator) {
        this.reader = reader;
        this.creator = creator;
        this.validator = validator;
    }


    public List<Array> transform(String filename) throws DataException {
//read lines from file
        //validate each line
        //for each valid line create array
        //return
        List<Array> content = new ArrayList<>();
        List<String> rawData = reader.readData(filename);
        for (int i = 0; i < rawData.size(); i++) {
            if (validator.validate(rawData.get(i))) {
                content.add(creator.create(rawData.get(i)));
            }
        }
        return content;
    }

}
