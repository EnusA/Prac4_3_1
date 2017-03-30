package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public abstract class SquareShapes implements Formulae{
    private double side1;
    private double side2;
    private double height;
    public SquareShapes(){}
    public SquareShapes(double s1, double s2, double h){
        side1 = s1;
        side2 = s2;
        height = h;
    }

    public double calcSquareArea(double side1, double side2) {
        return 0;
    }

    public double calcSquarePerim(double side1, double side2) {
        return 0;
    }

    public double calcSquareVolume(double side1, double side2, double height) {
        return 0;
    }

    /*public double calcCircleArea(double radius) {
        return 0;
    }

    public double calcCirclePerim(double radius) {
        return 0;
    }

    public double calcCircleVolume(double radius, double height) {
        return 0;
    }*/
}


