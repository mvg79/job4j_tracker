package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> nam = name -> name.getName().contains(key);
        Predicate<Person> surn = surname -> surname.getSurname().contains(key);
        Predicate<Person> pho = phon -> phon.getPhone().contains(key);
        Predicate<Person> addr = addres -> addres.getAddress().contains(key);
        var combine = nam.or(surn).or(pho).or(addr);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
