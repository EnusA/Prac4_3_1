package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public class describeConcrete {

    private String make;
    private String model;
    private int year;
    private double mileage;

    public describeConcrete() {};

    public describeConcrete (String mk, String mdl, int yr, double ml)
    {
        make = mk;
        model = mdl;
        year = yr;
        mileage = ml;
    }

    public String myString()
    {
        String description = ("Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nMileage: " + mileage);
        return description;
    }
}
