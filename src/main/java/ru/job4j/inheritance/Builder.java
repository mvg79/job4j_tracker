package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String roofer;

    public Builder(String name, String surname, String education, String birthday, int age, String roofer) {
        super(name, surname, education, birthday, age);
        this.roofer = roofer;
    }

    public void building() {
    }
}
