package com.dmdev.lesson19.practil.task2;

import java.sql.Array;
import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ivanov", 20, 7),
                new Student("Petr", "Petrov", 19, 8),
                new Student("Sveta", "Sveticova", 21, 3),
                new Student("Oleg", "Olegovich", 22, 10),
                new Student("Vovan", "Vovanovich", 19, 7)
        );
      /*  System.out.println( StudentsUtil.getBestStudent(students).toString());
        Collections.sort(students, new firstNameComparator());
        System.out.println(students);
        Collections.sort(students, new lastNameComparator());
        System.out.println(students);
        Collections.sort(students, new GpaComparator());
        System.out.println(students); */
        Collections.sort(students, new StudentsUtil.firstNameComparator().thenComparing(new StudentsUtil.GpaComparator()).thenComparing(new StudentsUtil.AgeComparator()));
        System.out.println(students);
    }


}
