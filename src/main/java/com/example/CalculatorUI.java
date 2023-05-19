package com.example;

public class CalculatorUI {
    private Calculator calculator;
    private Display display;

    public CalculatorUI(Calculator calculator, Display display) {
        this.calculator = calculator;
        this.display = display;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    
    public void performAddition(int b) {
        int result = calculator.add(b);
        display.displayResult(result);
    }

    public void performSubtraction(int b) {
        int result = calculator.subtract(b);
        display.displayResult(result);
    }
}
