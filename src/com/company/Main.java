package com.company;

public class Main {

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
        Circle circle = new Circle();
        System.out.println(circle);
        circle=new Circle(1.0);
        System.out.println(circle);
        circle=new Circle(2.0,"red",false);
        System.out.println(circle);
    }
}
