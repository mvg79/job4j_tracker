package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (i, s) -> map.put(i, s);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (i, u) -> i % 2 == 0 || map.get(i).length() == 4;
        for (Integer i : map.keySet()) {
            System.out.println(biPred.test(i, map.get(i)));
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        Consumer<String> con = (s) -> System.out.println(sup);
        Function<String, String> func = s -> s.toUpperCase(Locale.ROOT);
        for (String s : sup.get()) {
            System.out.println(func.apply(s));

        }
    }
}