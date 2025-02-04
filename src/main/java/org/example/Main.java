package org.example;

public class Main {
    public static void main(String[] args) {


        BMICalculator bmi = new BMICalculator("Stefan", "Meier", 180, 120, 'm');
        System.out.println("bmi.calculateBMI() = " + bmi.calculateBMI());
        System.out.println("bmi.calculateBMICategory() = " + bmi.calculateBMICategory());
        System.out.println("bmi.getCategoryName() = " + bmi.getBMICategoryName());



    }
}