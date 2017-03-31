package com.EnusA.Prac4_3_1;

/**
 * Abdullah Enus - 214018318
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calc = new Calculator(3,2,'e');

        System.out.println( "The answer is: " + calc.getAnswer());
    }
}

/*
* My understanding of the Single Responsibility Principle is that when a class is created it should have only one method/function.
* This application as it stands should respect this principle however by removing some comment tags as stated in the Calculate class.
*/
