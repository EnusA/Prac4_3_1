package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public class Square extends SquareShapes {
    public Square(){}
    public Square(double s1, double s2, double h) {
        super(s1, s2, h);
    }

    public double calcSquareArea(double side1, double side2) {
        return side1 * side2;
    }
    public double calcSquarePerim(double side1, double side2) {
        return (side1*2) + (side2 * 2);
    }
}
