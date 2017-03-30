package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public class Circle extends CircularShapes{
    public Circle(){};

    public double calcCircleArea(double radius) {
        return 3.14 * (radius*radius);
    }
    public double calcCirclePerim(double radius) {
        return (2 * 3.14) * radius;
    }
}
