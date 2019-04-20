package com.yura.pav.exception;

import java.util.Arrays;

public class Group {

    private Student[] st = new Student[10];

    public Group() {
        super();
    }

    public void addStudent(Student student) throws MyExeption {

        if (student == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < st.length; i++) {
            if (st[i] == null) {
                st[i] = student;
                return;
            }
        }
        throw new MyExeption();
    }

    public boolean deleteStudent(long cardNumber) {

        for (int i = 0; i < st.length; i++) {
            if (st[i] != null && st[i].getStudentCard() == cardNumber) {
                st[i] = null;
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(String lastName) {

        for (Student student : st) {
            if (student != null && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Group{" +
                "st=" + Arrays.toString(st) +
                '}';
    }
}




