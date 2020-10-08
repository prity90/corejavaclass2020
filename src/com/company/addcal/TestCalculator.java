package com.company.addcal;

public class TestCalculator {
    public static void main(String[] args) {

        int additionResult = Calculator.addition(30, 60, 80);
        int subtractionResult = Calculator.subtraction(30, 5, 8);
        System.out.println(additionResult);
        System.out.println(subtractionResult);

    }
}