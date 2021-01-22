package com.epam.task.first.logic;

import com.epam.task.first.entities.ArrayEntities;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest extends ArrayEntities {

    @org.junit.jupiter.api.Test
    void findMax() throws Exception {
        Array testIdentity=new Array(10,20,30);
        assertEquals(testIdentity.findMax(),30);
    }

    @org.junit.jupiter.api.Test
    void replace() throws Exception {
        Array testIdentity=new Array(10,20,30);
        assertTrue(testIdentity.replace(30,100));
    }

    @org.junit.jupiter.api.Test
    void summary() throws Exception {
        Array testIdentity=new Array(10,20,30);
        assertEquals(testIdentity.summary(),60);
    }

    @org.junit.jupiter.api.Test
    void average() throws Exception {
        Array testIdentity=new Array(10,20,30);
        assertEquals(testIdentity.average(),20);
    }

    @org.junit.jupiter.api.Test
    void negatives() throws Exception {
        Array testIdentity=new Array(-10,-20,30);
        assertEquals(testIdentity.negatives(),2);
    }

    @org.junit.jupiter.api.Test
    void positives() throws Exception {
        Array testIdentity=new Array(10,20,-30);
        assertEquals(testIdentity.positives(),2);
    }
}