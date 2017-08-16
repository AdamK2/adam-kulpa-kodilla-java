package com.kodilla.testing.Calculator;

import com.kodilla.testing.Calculator.Calculator;

class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double result = calculator.addAToB(50, 10);

        if (result == 60) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator2 = new Calculator();
        double result2 = calculator2.substractAFromB(50, 10);

        if (result2 == 40) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}


