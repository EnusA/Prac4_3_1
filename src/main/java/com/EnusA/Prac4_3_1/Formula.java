package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */

//Violates Single Responsibility Principle
public class Formula {
    public double add(double num1, double num2){
                return num1 + num2;
    }
    public double multiply(double num1, double num2){
        return num1 * num2;
    }
    public double divide(double num1, double num2){
        return num1 / num2;
    }
    public double subtract(double num1, double num2){
        return num1 - num2;
    }
}
