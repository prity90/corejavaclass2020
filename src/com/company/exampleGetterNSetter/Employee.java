package com.company.exampleGetterNSetter;

public class Employee {
    private String eName;
    private int eID;
    private String eSchedule;

    public Employee(){

    }

    public String geteName() {
        return eName;
    }

    public int geteID() {
        return eID;
    }

    public String geteSchedule() {
        return eSchedule;
    }

    public Employee(String eName, int eID, String eSchedule){
        this.eName = eName;
        this.eID = eID;
        this.eSchedule = eSchedule;

    }

}
