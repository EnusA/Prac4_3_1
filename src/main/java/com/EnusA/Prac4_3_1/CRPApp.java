package com.EnusA.Prac4_3_1;

import java.util.Scanner;

/**
 * Created by enusa on 2017/03/31.
 */
public class CRPApp {
    public static void main(String []args){
        String guess = "";
        CRPCompare comp = new CRPCompare();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Please guess the word: ");
            guess = scan.next();
            comp.comparison(guess);
        }while (guess != "Stop");
    }
}


/*
 *This code follows the rules of the CRP focusing on polymorphism through OOP rather than Inheritance.
 *The CRPApp class calls the methods from the comp object which is an Object of CRPCompare. CRPCompare does the same
 * With CRPGenerator.
 * CRP Is violated in the other classes. check Generator and Compare class
*/