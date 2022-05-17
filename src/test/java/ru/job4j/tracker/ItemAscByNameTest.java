package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void sortAsc() {
        List<Item> items = Arrays.asList(
                new Item(1, "A"),
                new Item(3, "C"),
                new Item(2, "B")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "A"),
                new Item(2, "B"),
                new Item(3, "C")
        );
        assertThat(items, is(expected));
    }
}