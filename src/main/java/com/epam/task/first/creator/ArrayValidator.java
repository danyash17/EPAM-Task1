package com.epam.task.first.creator;

public class ArrayValidator {
    public boolean validate(String line) {
        String lineCopy = new String(line);
        char[] symbolsToCheck = lineCopy.toCharArray();
        int i = 0;
        while (i < lineCopy.length()) {
            if (symbolsToCheck[i] == 32) {
                i++;
                continue;
            }
            if (symbolsToCheck[i] <= 47 || symbolsToCheck[i] >= 58) return false;
            i++;
        }
        return true;
    }
}
