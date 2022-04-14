package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

public class PointTest extends TestCase {

    @Test
    public void testWhen00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void testWhen21to83then6dot32() {
        Point a = new Point(2, 1);
        Point b = new Point(8, 3);
        double expected = 6.32;
        assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void testWhen01to69then10() {
        Point a = new Point(0, 1);
        Point b = new Point(6, 9);
        double expected = 10;
        assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void testWhen000to222then3dot46() {
        Point c = new Point(0, 0, 0);
        Point d = new Point(2, 2, 2);
        double expected = 3.46;
        assertEquals(expected, c.distance3d(d), 0.01);
    }
}