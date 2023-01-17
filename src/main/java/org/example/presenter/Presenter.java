package org.example.presenter;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Presenter {
    private List<String> percentList(Student student) {
        List<String> percentList = new ArrayList<>();
        double percent = (double) student.wasAtLesson() / student.allLessons() * 100;
        percentList.add(student.getName());
        percentList.add(String.valueOf(percent));

        return percentList;
    }

    public List<String> percentStudents(List<Student> students) {
        List<String> percentStudents = new ArrayList<>();
        for (Student student : students) {
            percentStudents.add(percentList(student).toString());
        }
        return percentStudents;
    }

    public List<String> filterStudents(List<Student> students) {
        List<String> percentStudents = new ArrayList<>();
        for (Student student : students) {
            percentStudents.add(percentList(student).toString());
        }
        Collections.sort(percentStudents);
        return percentStudents;
    }

    public List<String> studentsMoreThan25Percent(List<Student> students) {
        List<String> percentStudents = new ArrayList<>();
        for (Student student : students) {
            if ((double) student.wasAtLesson() / student.allLessons() * 100 > 25.00) {
                percentStudents.add(student.getName());
                percentStudents.add(
                        String.valueOf((double) student.wasAtLesson() / student.allLessons() * 100));
            }
        }
        return percentStudents;
    }
}
