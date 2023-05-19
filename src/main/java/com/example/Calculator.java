package com.example;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    private int result;

    public int add(int b) {
        this.result = result + b;
        return result;
    }

    public int subtract(int b) {
        this.result = result - b;
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
