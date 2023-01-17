package org.example.view;

import org.example.model.Student;

import java.util.List;

public class AttendanceView {
    public void sendOnConsole(List<Student> students) {
        System.out.println(students);
    }
    public void sendOnConsoleList(List <String> students) {
        System.out.println(students);
    }
}
