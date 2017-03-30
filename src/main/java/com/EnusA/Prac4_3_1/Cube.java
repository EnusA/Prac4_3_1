package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public class Cube extends SquareShapes {
    public Cube(){}
    public Cube(double s1, double s2, double h) {
        super(s1,s2, h);
    }

    public double calcSquareVolume(double side1, double side2, double height) {
        return (side1 * side2) * height;
    }
}
