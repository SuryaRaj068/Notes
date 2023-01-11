package Polymorphism;

import Encapsulation.EmailUser;

public class FirstEx extends EmailUser {
    public static void main(String args[]) {
        System.out.println("Hi");
        System.out.println(56);
        System.out.println(56.0);
        FirstEx obj = new FirstEx();
        obj.add(10, 20);
        obj.add(10, 20, 20);
        obj.add(20f, 20f);
        // System.out.println(obj.userName);
    }

    public static void main(String args) {

    }

    static void add(int a, int b) {
        System.out.println(a + b);

    }

    static int add(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b;
    }

    void add(float a, float b) {
        System.out.println(a + b);
    }

}
