package org.example;

import org.example.model.AttendanceService;
import org.example.presenter.Presenter;
import org.example.view.AttendanceView;

public class Main {
    public static void main(String[] args) {
        AttendanceService attendanceService = new AttendanceService();
        AttendanceView attendanceView = new AttendanceView();
        attendanceView.sendOnConsole(attendanceService.getStudents());

        Presenter presenter = new Presenter();
        attendanceView.sendOnConsoleList(presenter.percentStudents(attendanceService.getStudents()));
        attendanceView.sendOnConsoleList(presenter.filterStudents(attendanceService.getStudents()));
        attendanceView.sendOnConsoleList(presenter.studentsMoreThan25Percent(attendanceService.getStudents()));
    }
}