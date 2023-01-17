package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AttendanceService {
    public List<Student> getStudents() {
        List<Presence<LocalDate, Boolean>> logStudent1 =
                Arrays.asList(new Presence<>(LocalDate.of(2023, 01, 9), false),
                        new Presence<>(LocalDate.of(2023, 01, 10), false),
                        new Presence<>(LocalDate.of(2023, 01, 11), false),
                        new Presence<>(LocalDate.of(2023, 01, 12), false),
                        new Presence<>(LocalDate.of(2023, 01, 13), true));
        Student student = new Student("Anna", logStudent1);

        List<Presence<LocalDate, Boolean>> logStudent2 =
                Arrays.asList(new Presence<>(LocalDate.of(2023, 01, 9), true),
                        new Presence<>(LocalDate.of(2023, 01, 10), true),
                        new Presence<>(LocalDate.of(2023, 01, 11), false),
                        new Presence<>(LocalDate.of(2023, 01, 12), false),
                        new Presence<>(LocalDate.of(2023, 01, 13), true));
        Student student2 = new Student("Oleg", logStudent2);


        List<Presence<LocalDate, Boolean>> logStudent3 =
                Arrays.asList(new Presence<>(LocalDate.of(2023, 01, 9), true),
                        new Presence<>(LocalDate.of(2023, 01, 10), true),
                        new Presence<>(LocalDate.of(2023, 01, 11), true),
                        new Presence<>(LocalDate.of(2023, 01, 12), true),
                        new Presence<>(LocalDate.of(2023, 01, 13), true));
        Student student3 = new Student("Elena", logStudent3);


        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);


        return students;
    }
}
