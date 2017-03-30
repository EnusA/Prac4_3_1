package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public abstract class describe implements Vehicle{
        private String make;
        private String model;
        private int year;
        private double mileage;

        public describe () {};

        public describe (String mk, String mdl, int yr, double ml)
        {
            make = mk;
            model = mdl;
            year = yr;
            mileage = ml;
        }


    public String getMake()
    {
        return make;
    }

    public void setMake(String mk)
    {
        make = mk;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String mdl)
    {
        model = mdl;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int yr)
    {
        year = yr;
    }

    public double getMileage()
    {
        return mileage;
    }

    public void setMileage(double ml)
    {
        mileage = ml;
    }

    public String myString(String description)
    {
        description = ("Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nMileage: " + mileage);
        return description;
    }
}
