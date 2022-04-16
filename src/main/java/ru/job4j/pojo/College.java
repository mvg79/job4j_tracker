package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Petr Arsentev");
        student.setGroup("2984");
        student.setDate(new Date());

        System.out.println("ФИО " + student.getFio() + " Группа " + student.getGroup() + " Дата " + student.getDate());
    }
}
