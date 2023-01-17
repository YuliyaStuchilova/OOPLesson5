package org.example.model;

public class Presence <LocalDate, Boolean> {
    private LocalDate param1;
    private Boolean param2;

    public Presence(LocalDate param1, Boolean param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public LocalDate getParam1() {
        return param1;
    }

    public Boolean getParam2() {
        return param2;
    }

    public int was(){
        int count =0;
        if(this.param2.equals(true)){
            count=1;
        }
        return count;
    }

    @Override
    public String toString() {
        return  param1 + " " + param2 + "\n";
    }
}
