package com.dmdev.lesson19.person;

public class Person {
    private int id;
    private String firsName;
    private String lastName;

    public Person (int id, String firsName, String lastname) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastname;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
}
