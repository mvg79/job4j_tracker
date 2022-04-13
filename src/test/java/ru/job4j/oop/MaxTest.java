package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To4And8Then10() {
        int left = 4;
        int right = 8;
        int leftTwo = 10;
        int result = Max.max(left, right, leftTwo);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To5And8And3Then10() {
        int left = 5;
        int right = 8;
        int leftTwo = 3;
        int rightTwo = 10;
        int result = Max.max(left, right, leftTwo, rightTwo);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }
}