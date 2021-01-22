package com.epam.task.first.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//core class with entities
public class ArrayEntities<T> {
    protected List<T> elements;

    public ArrayEntities(T... elements) {
        this.elements = new ArrayList<T>();
        this.elements.addAll(Arrays.asList(elements));

    }

    public ArrayEntities(List<T> elements) {
        this.elements = elements;
    }

    public List<T> getElements()
    {
        if(elements==null) {return null;} else
        return elements;
    }

    public int getSize() {
        if(elements==null) {return 0;} else
        return elements.size();
    }
}
