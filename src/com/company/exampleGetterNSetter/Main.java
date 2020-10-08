package com.company.exampleGetterNSetter;

import com.company.exampleGetterNSetter.Employee;

public class Main {

    public static void main(String[] args){
        Employee e1 = new Employee("Sam",105, "9AM-5PM");
        System.out.println(e1.geteName()+" "+e1.geteID()+" "+e1.geteSchedule());



    Employee e2 = new Employee("Dom",104, "8AM-3PM");
        System.out.println(e2.geteName()+" "+e2.geteID()+" "+e2.geteSchedule());

}
}
