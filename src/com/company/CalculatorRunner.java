package com.company;

import java.io.InvalidClassException;

public class CalculatorRunner {
    public static void main(String[] args) throws InvalidClassException {
        Calculator calculator = new Calculator();
        calculator.calculate();
    }
}
