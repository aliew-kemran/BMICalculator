package org.example;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @org.junit.jupiter.api.Test
    void calculateBMI() {
        BMICalculator bmiCalc1 = new BMICalculator("Anna", "Froh", 170, 70.0, 'w');
        assertEquals(24.22, bmiCalc1.calculateBMI(), 0.01);

        BMICalculator bmiCalc2 = new BMICalculator("Stefan", "Meier", 180, 120.0, 'm');
        assertEquals(37.04, bmiCalc2.calculateBMI(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void calculateBMICategory() {
        BMICalculator bmiCalc1 = new BMICalculator("Lisa", "Beispiel", 170, 70.0, 'w');
        assertEquals(1, bmiCalc1.calculateBMICategory());

        BMICalculator bmiCalc2 = new BMICalculator("Karl", "Groß", 180, 120.0, 'm');
        assertEquals(2, bmiCalc2.calculateBMICategory());
    }

    @org.junit.jupiter.api.Test
    void getBMICalculatorName() {
        BMICalculator bmiCalc1 = new BMICalculator("Paul", "Lang", 170, 70.0, 'w');
        assertEquals("Übergewicht", bmiCalc1.getBMICategoryName());

        BMICalculator bmiCalc2 = new BMICalculator("Tim", "Schmidt", 180, 120.0, 'm');
        assertEquals("Sehr stark Übergewicht", bmiCalc2.getBMICategoryName());
    }
}