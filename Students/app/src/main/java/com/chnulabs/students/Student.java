package com.chnulabs.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;
    public Student (String name, String groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }
    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Грекова Дар'я", "301"),
                    new Student("Перекіпський Богдан", "301"),
                    new Student("Супруненко Ігор", "302"),
                    new Student("Козлан Анастасія", "302"),
                    new Student("Щелконогов Олександр", "308"),
                    new Student("Верещагін Денис", "308"),
                    new Student("Лісова Ірина", "309"),
                    new Student("Ігнаткіна Єлизавета", "309")
            )
    );

    public static ArrayList<Student> getStudents(String groupNumber) {
        ArrayList<Student> stList = new ArrayList<>();
        for (Student s: students) {
            if (s.getGroupNumber().equals(groupNumber)) {
                stList.add(s);
            }
        }
        return stList;
    }
}
