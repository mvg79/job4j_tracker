package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int leftTwo) {
        return max(
                leftTwo,
                max(left, right)
        );
    }

    public static int max(int left, int right, int leftTwo, int rightTwo) {
        return max(
                rightTwo,
                max(left, right, leftTwo)
        );
    }

    public static void main(String[] args) {
        int msg = Max.max(4, 8, 10, 12);
        System.out.println(msg);
    }
}
