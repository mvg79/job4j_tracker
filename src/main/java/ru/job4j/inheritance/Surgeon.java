package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String experience;

    public Surgeon(String name, String surname, String education, String birthday, String gender, String experience) {
        super(name, surname, education, birthday, gender);
        this.experience = experience;
    }

    public void operation() {
    }
}
