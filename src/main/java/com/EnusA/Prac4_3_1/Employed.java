package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public class Employed extends Person{
    public Employed(){}
    public Employed(String nm, String sn, String id, int ag){
        super(nm, sn, id, ag);
    }

    public double calculateSalary(double hoursWorked, double rate) {
        return hoursWorked *rate;
    }
}
