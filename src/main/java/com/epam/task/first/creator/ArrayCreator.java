package com.epam.task.first.creator;

import com.epam.task.first.logic.Array;

import java.util.*;


public class ArrayCreator {
    private ArrayValidator validator = new ArrayValidator();

    public Array create(String data) {
        String strArr[] = data.split(" ");
        ArrayList<Double> forConstructor = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            forConstructor.add(Double.parseDouble(strArr[i]));
        }
        Array content = new Array(forConstructor);
        return content;
    }
}
