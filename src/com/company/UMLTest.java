package com.company;

public class UMLTest {

    public static void main(String[] args){

        Circle circle = new Circle(8);
        System.out.println(circle);
        circle.setColor("violet");
        circle.setFilled(true);
        System.out.println("\n" + circle);


        Rectangle rectangle = new Rectangle(5,8,"green",false);
        System.out.println("\n" + rectangle);


        Square square = new Square(6,"white",true);
        System.out.println("\n" + square);


        Shape shape_circle = new Circle(2,"orange",false);
        Shape shape_rectangle = new Rectangle(1,1,"blue", true);
        Shape shape_square = new Square(5,"grey",true);

        System.out.println("\n" +shape_circle);
        System.out.println("\n" + shape_rectangle);
        System.out.println("\n" + shape_square);



    }

}