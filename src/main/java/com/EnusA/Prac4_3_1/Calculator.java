package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private char operator;
    public Calculator(){}
    public Calculator(double num1, double num2, char op){
        firstNumber = num1;
        secondNumber = num2;
        operator = op;
    }

    public void setFirstNumber(double num1){
        firstNumber = num1;
    }
    public void setSecondNumber(double num2){
        secondNumber = num2;
    }
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    //  Single Responsibility Principle
    public double getAnswer(){
        Addition adds = new Addition();
        Multiplication times = new Multiplication();
        Subtraction minus = new Subtraction();
        Division div = new Division();
        switch (operator){
            case '+':
                return adds.add(firstNumber,secondNumber);
            case '*':
                return times.multiply(firstNumber,secondNumber);
            case '/':
                return div.divide(firstNumber,secondNumber);
            case '-':
                return minus.subtract(firstNumber,secondNumber);
            default:
                return 0;
        }
    }
    /*  Violates the Single Responsibility Principle
        public double getAnswer(){

        Formula formula = new Formula();
        switch (operator){
            case '+':
                return formula.add(firstNumber,secondNumber);
            case '*':
                return formula.multiply(firstNumber,secondNumber);
            case '/':
                return formula.divide(firstNumber,secondNumber);
            case '-':
                return formula.subtract(firstNumber,secondNumber);
            default:
                return 0;
        }
    }*/
}
