package application;

import entities.Triangle;

public class Program {
    public static void main(String[] args){
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        x.a = 1.0;
        x.b = 2.0;
        x.c = 3.0;

        y.a = 4.0;
        y.b = 5.0;
        y.c = 6.0;

        System.out.println(x.area());
        System.out.printf("%.2f", y.area());
    }
}
