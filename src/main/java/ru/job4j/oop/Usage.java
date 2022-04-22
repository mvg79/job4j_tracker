package ru.job4j.oop;

public class Usage {

    public static void main(String[] args) {
        Plane plane = new Plane();
        Train train = new Train();
        Bus bus = new Bus();

        Vehicle[] vehicle = new Vehicle[]{plane, train, bus};
        for (Vehicle a : vehicle) {
            a.move();
        }
    }
}
