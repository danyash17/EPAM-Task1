package com.epam.task.first.logic;

import com.epam.task.first.entities.ArrayEntities;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest extends ArrayEntities {

    @org.junit.jupiter.api.Test
    void testFindMaxWhenAppliedThreePositives() throws Exception {
        Array testIdentity=new Array(10,20,30);
        assertEquals(testIdentity.findMax(),30);
    }

    @org.junit.jupiter.api.Test
    void testReplaceOneElementOfThree() throws Exception {
        Array testIdentity=new Array(10,20,30);
        assertTrue(testIdentity.replace(30,100));
    }

    @org.junit.jupiter.api.Test
    void testSummaryOfThreePositives() throws Exception {
        Array testIdentity=new Array(10,20,30);
        assertEquals(testIdentity.giveSummary(),60);
    }

    @org.junit.jupiter.api.Test
    void testAverageOfThreePositives() throws Exception {
        Array testIdentity=new Array(10,20,30);
        assertEquals(testIdentity.average(),20);
    }

    @org.junit.jupiter.api.Test
    void testNegativesOfThreeNumbersWhenTwoAreNegative() throws Exception {
        Array testIdentity=new Array(-10,-20,30);
        assertEquals(testIdentity.giveNegatives(),2);
    }

    @org.junit.jupiter.api.Test
    void testPositivesOfThreeNumbersWhenTwoArePositives() throws Exception {
        Array testIdentity=new Array(10,20,-30);
        assertEquals(testIdentity.givePositives(),2);
    }
}