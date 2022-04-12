package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
       return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        int rsl = calculator.multiply(5);
        int rslTwo = minus(10);
        int rslThree = calculator.divide(50);
        int rslFour = calculator.sumAllOperation(50);
        System.out.println(rslThree);
        System.out.println(result);
        System.out.println(rsl);
        System.out.println(rslTwo);
        System.out.println(rslFour);
    }
}
