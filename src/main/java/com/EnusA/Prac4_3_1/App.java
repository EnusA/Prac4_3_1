package com.EnusA.Prac4_3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Abdullah Enus - 214018318
 *
 */
public class App {
    public static void main(String []args){
        String guess = "";
        Compare comp = new Compare();
        Scanner scan = new Scanner(System.in);
        do{
        System.out.print("Please guess the word: ");
        guess = scan.next();
        comp.comparison(guess);
        }while (guess != "Stop");
    }
}

/*
* As per my understanding of the Composite Reuse Principle.
* This application should be violating the CRP where the Compare Class inherits methods and data members from the
* Generator Class. However the App class does use OOP to call the mehtods from the Compare class, which follows the
* CRP. However i have prepared seperate classes that perform the same functions using OOP instead of inheritance.
* Check CRP-Classes
*/