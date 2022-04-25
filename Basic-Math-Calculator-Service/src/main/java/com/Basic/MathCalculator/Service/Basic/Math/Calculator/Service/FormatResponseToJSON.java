package com.Basic.MathCalculator.Service.Basic.Math.Calculator.Service;

public class FormatResponseToJSON {

    private int num1;
    private int num2;
    private int result;

    public FormatResponseToJSON(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResult() {
        return result;
    }
}
