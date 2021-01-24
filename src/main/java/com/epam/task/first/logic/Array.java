package com.epam.task.first.logic;

import com.epam.task.first.entities.ArrayEntities;
import com.epam.task.first.face.Report;

import java.util.List;

//extended class with logics
public class Array<T> extends ArrayEntities implements Report {
    public Array(T... elements) {
        super(elements);
    }

    public Array(List<T> elements) {
        super(elements);
    }

    private final int length = super.getSize();

    public <T extends Comparable<T>> T findMax() throws Exception {
        if (elements==null) throw new Exception("Null Array");
        List buff = super.getElements();
        int i = 0;
        int end = length;
        T maxElem = (T) buff.get(i);
        for (++i; i < end; i++) {
            if (maxElem.compareTo((T) buff.get(i)) < 0) {
                maxElem = (T) buff.get(i);
            }
        }
        return maxElem;
    }

    //return false if replace is not done
    public <T> boolean replace( T toChange,T key) throws Exception {
        if (elements==null) throw new Exception("Null Array");
        int end = length;
        for (int i = 0; i < end; i++) {
            if (elements.get(i).equals(toChange)) {
                try {
                    elements.set(i,key);
                } catch (IllegalArgumentException e) {
                    System.out.println("Illegal argument");
                }
            }
        }
        return true;
    }

    public <T extends Number> double giveSummary() throws Exception {
        if (elements==null) throw new Exception("Null Array");
        int end = length;
        T undefSum=(T) elements.get(0);
        Double sum= undefSum.doubleValue();
        for (int i = 1; i < end; i++) {
            T undefCurrent=(T) elements.get(i);
            Double current= undefCurrent.doubleValue();
            sum+=current;
        }
        return sum;
    }
    public double average() throws Exception {
        return giveSummary()/length;
    }
    public<T extends Number> int giveNegatives() throws Exception{
        if (elements==null) throw new Exception("Null Array");
        int end=length;
        int count=0;
        for(int i=0;i<end;i++){
            T undefCurrent=(T)elements.get(i);
            if(undefCurrent.intValue()<0) count++;
        }
        return count;
    }
    public<T extends Number> int givePositives() throws Exception{
        if (elements==null) throw new Exception("Null Array");
        int end=length;
        int count=0;
        for(int i=0;i<end;i++){
            T undefCurrent=(T)elements.get(i);
            if(undefCurrent.intValue()>0) count++;
        }
        return count;
    }
    public void print(Array content) {
        if (elements==null) System.out.println("null");
        int i = 0;
        int end = length;
        System.out.println("___");
        while (i < end) {
            System.out.println(elements.get(i));
            i++;
        }
        System.out.println("___");
    }
}


