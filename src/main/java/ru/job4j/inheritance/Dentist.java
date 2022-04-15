package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String implantolog;

    public Dentist(String name, String surname, String education, String birthday, String gender, String implantolog) {
        super(name, surname, education, birthday, gender);
        this.implantolog = implantolog;
    }

    public void teeth() {
    }
}
