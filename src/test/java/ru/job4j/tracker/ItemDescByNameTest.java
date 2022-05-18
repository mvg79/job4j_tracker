package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void sortDesc() {
        List<Item> items = Arrays.asList(
                new Item(1, "A"),
                new Item(3, "C"),
                new Item(2, "B")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "C"),
                new Item(2, "B"),
                new Item(1, "A")
        );
        assertThat(items, is(expected));
    }
}