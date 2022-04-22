package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Едем");
    }

    @Override
    public void passenger(int countPas) {
        System.out.println("Количество пассажиров " + countPas);
    }

    @Override
    public double refuel(int countFuel) {
        int cost = 50;
        return countFuel * cost;
    }
}
