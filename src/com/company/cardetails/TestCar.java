package com.company.cardetails;

public class TestCar {
    public static final Car CAR = new Car("Toyota ","Camry", 2020, 26000);


    public static void main(String[] args) {


    System.out.println(CAR.getMake()+""+CAR.getMode()+""+CAR.getYear()+" "+CAR.getPrice());


    }
}