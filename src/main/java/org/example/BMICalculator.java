package org.example;

public class BMICalculator {
    private final String firstName;
    private final String lastName;
    private int bodyHeight;
    private double bodyWeight;
    private final char gender;


    public BMICalculator(String firstName, String lastName, int bodyHeight, double bodyWeight, char gender){

        this.firstName = firstName;
        this.lastName = lastName;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    //set

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public double calculateBMI() {
        double bmi = bodyWeight / (((double) bodyHeight / 100) * ((double) bodyHeight / 100));
        return round(bmi);
    }

    public int calculateBMICategory() {
        double bmi = calculateBMI();
        if (gender == 'm') {
            if (bmi < 16.0) return -2;
            if (bmi >= 16.0 && bmi <= 18.4) return -1;
            if (bmi >= 18.5 && bmi <= 24.9) return 0;
            if (bmi >= 25.0 && bmi <= 34.9) return 1;
            return 2;
        } else {
            if (bmi < 15.0) return -2;
            if (bmi >= 15.0 && bmi <= 17.4) return -1;
            if (bmi >= 17.5 && bmi <= 23.9) return 0;
            if (bmi >= 24.0 && bmi <= 33.9) return 1;
            return 2;
        }
    }

    public String getBMICategoryName() {
        int category = calculateBMICategory();
        return switch (category) {
            case -2 -> "Sehr starkes Untergewicht";
            case -1 -> "Untergewicht";
            case 0 -> "Normalgewicht";
            case 1 -> "Übergewicht";
            case 2 -> "Sehr starkes Übergewicht";
            default -> "Unbekannt";
        };
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }



}

