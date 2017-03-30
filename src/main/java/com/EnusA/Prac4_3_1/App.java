package com.EnusA.Prac4_3_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Abdullah Enus - 214018318
 *
 */
public class App {
    public static void executeSquareType(){
        Square sq = new Square();
        Cube cb = new Cube();
        System.out.println("Area of a square: " + sq.calcSquareArea(5,5));
        System.out.println("Perimeter of a square: " + sq.calcSquarePerim(5,5));
        System.out.println("Volume of a Cube: " + cb.calcSquareVolume(5,5,10) + "\n");
    }
    public static void executeCircleType(){
        Circle ci = new Circle();
        Cylinders cy = new Cylinders();
        System.out.println("Area of a circle: " + ci.calcCircleArea(9));
        System.out.println("Perimeter of a circle: " + ci.calcCirclePerim(9));
        System.out.println("Volume of a Cylinder: " + cy.calcCircleVolume(9,10));
    }
    public static void main(String[] args) {
        executeSquareType();
        executeCircleType();
    }
}


/*
* According to my understanding of the ISP if you remove the comment tags from the code in the
* Formulae Interface, SquareShapes Class, CircleShapes Class and replacing the class declaration in the CircularShapes
* Class with the already commented out declaration, the ISP will be violated. However in its current for it adheres to
* the ISP.
* */