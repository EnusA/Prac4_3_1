package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/30.
 */
public class Person {
    private String name;
    private String surname;
    private String idNo;
    private int age;

    public Person(){}
    public Person(String nm, String sn, String id, int ag){
        name = nm;
        surname = sn;
        idNo = id;
        age = ag;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getIDNo() {
        return idNo;
    }
    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        surname = surname;
    }
    public void setIDNo(String IDNo) {
        this.idNo = IDNo;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /*remove comment tags to violate LSP
    public double calculateSalary(double hoursWorked, double rate){
        return hoursWorked *rate;
    }*/
    public String myString(){
        return "Name: " + name + "\nSurname:" + surname + "\nID Number: " + idNo + "\nAge: " + age;
    }
}
