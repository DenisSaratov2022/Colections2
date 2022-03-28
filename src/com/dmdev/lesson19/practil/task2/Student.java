package com.dmdev.lesson19.practil.task2;

public class Student implements Comparable {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int gpa;

    public Student(String firstName, String lastName, int age, int gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
