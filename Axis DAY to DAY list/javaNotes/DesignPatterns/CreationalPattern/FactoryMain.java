package DesignPatterns.CreationalPattern;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String args[]) {
        ObjectFactory obj = new ObjectFactory();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter shape name");
            String shape = sc.next();
            FactoryPatternDemoDraw shape1 = obj.drawTheShape(shape);
            shape1.draw();
        }
    }

}
