package com.company.cardetails;

public class Car {
    private String make;
    private String model;
    private int year;
    private int price;

    public Car(String make, String model, int year,int price ) {
        this.make = make;
        this. model = model;
        this.year = year;
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public String getMode() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getPrice() {
        return price;
    }
}
