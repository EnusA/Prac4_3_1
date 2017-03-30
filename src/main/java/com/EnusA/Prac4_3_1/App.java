package com.EnusA.Prac4_3_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Abdullah Enus 214018318
 *
 */
public class App {
    public static void main(String[] args) {

        List<Person> people= new ArrayList();
        people.add(new Person("Geoff", "Gordon","8002125469856",37));
        //people.add(new Employed("Barbara","Free","8510236958745",31));
        people.add(new Unemployed("Andrew", "Risinger", "8912205698458",28));
        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i).myString());
            //System.out.println("Salary: R" + people.get(i).calculateSalary(5,12.5));
        }
        Employed employee = new Employed("Barbara","Free","8510236958745",31);

        System.out.println(employee.myString() + "Salary: R" + employee.calculateSalary(24,15.95));
    }
}

//Person is super class. Unemployed and Employed can both be substituted with Person. however Employed's
// calculateSalary mehtod can only be used by Employed.
//If comment tags are removed from code in Person and Appthey can all be used as substitutes for Person but
// Unemployed will have access to the calculateSalary method which it should not have access to.