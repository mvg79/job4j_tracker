package ru.job4j.poly;

public interface Transport {
    void go();

    void passenger(int countPas);

    double refuel(int countFuel);
}
