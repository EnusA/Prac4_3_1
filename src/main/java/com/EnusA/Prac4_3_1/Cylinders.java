package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public class Cylinders extends CircularShapes{
    public Cylinders(){};

    public double calcCircleVolume(double radius, double height) {
        return (3.14*(radius * radius)) * height;
    }
}
