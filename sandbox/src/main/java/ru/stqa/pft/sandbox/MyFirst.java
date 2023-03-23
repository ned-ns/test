package ru.stqa.pft.sandbox;

public class MyFirst {

    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("Площадь квадрата = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника = " + r.area());

        Point p = new Point(1, 5);
        System.out.println("Расстояние равно =" + p.distance());
    }


    };

