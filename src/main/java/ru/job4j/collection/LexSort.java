package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] spLeft = left.split(". ");
        String[] spRight = right.split(". ");
        return Integer.compare(Integer.parseInt(spLeft[0]),
                Integer.parseInt(spRight[0]));
    }
}