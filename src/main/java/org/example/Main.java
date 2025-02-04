package org.example;

public class Main {
    public static void main(String[] args) {


        BMICalculator bmiCalc = new BMICalculator("Stefan", "Meier", 180, 120, 'm');
        System.out.println("bmiCalc.calculateBMI() = " + bmiCalc.calculateBMI());
        System.out.println("bmiCalc.calculateBMICategory() = " + bmiCalc.calculateBMICategory());
        System.out.println("bmiCalc.getCategoryName() = " + bmiCalc.getBMICategoryName());



    }
}