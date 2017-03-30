package com.EnusA.Prac4_3_1;

/**
 * Hello world!
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
