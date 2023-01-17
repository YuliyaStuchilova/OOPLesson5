package org.example.model;

import java.time.LocalDate;
import java.util.List;

public class Student {
    private String name;

    private List<Presence<LocalDate, Boolean>> log;

    public Student(String name, List<Presence<LocalDate, Boolean>> log) {
        this.name = name;
        this.log = log;
    }

    public String getName() {
        return name;
    }

    public List<Presence<LocalDate, Boolean>> getListLog() {
        return log;
    }

    public int allLessons(){
        return this.log.size();
    }
    public int wasAtLesson() {
        int count =0;
        for (Presence <LocalDate, Boolean> item:log) {
            if(item.was()==1){
                count++;
            }

        }
        return count;
    }

    @Override
    public String toString() {
        return name + "\n" + log + "\n";
    }
}
