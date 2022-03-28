package com.dmdev.lesson19.practil.task2;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public final class StudentsUtil {
    public StudentsUtil() {
    }

    public static Student getBestStudent(List<Student> students) {
        Student theBestStudent = null;
        for (Student student:students) {
            if (theBestStudent==null||theBestStudent.getGpa()<student.getGpa()){
                theBestStudent = student;
        }
        }
        return theBestStudent;
}
    public static class firstNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    public static class lastNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    public static class GpaComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getGpa() - o2.getGpa();
        }
    }

    public static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge() - o2.getAge();
        }
    }
}

