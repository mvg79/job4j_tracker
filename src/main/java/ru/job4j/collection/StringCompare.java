package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int len = Math.min(left.length(), right.length());
            for (int index = 0; index < len; index++) {
                int rsl = Character.compare(left.charAt(index), right.charAt(index));
                if (rsl != 0) {
                    return rsl;
                }
            }
        return Integer.compare(left.length(), right.length());
    }
}