package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String gender;

    public Doctor(String name, String surname, String education, String birthday, String gender) {
        super(name, surname, education, birthday);
        this.gender = gender;
    }

    public void diagnosis() {
    }
}
