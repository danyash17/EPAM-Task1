package com.epam.task.first.entities;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayEntitiesTest {

    @Test
    void getElements() {
        Integer[] testPreArray={10,20,30};
        ArrayEntities testIdentity=new ArrayEntities(testPreArray);
        List testList=testIdentity.getElements();
        assertEquals(testList.get(0),10);
        assertEquals(testList.get(1),20);
        assertEquals(testList.get(2),30);
    }


    @Test
    void getSize() {
        ArrayEntities testIdentity=new ArrayEntities(1,2,3);
        assertTrue(testIdentity.getSize()==3);
    }
}