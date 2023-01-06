package Inheritnce;

public class Parent {
    String name;
    private int Age;
    private long phno;
    static String place;

    public Parent(int Age, long phno) {
        this.Age = Age;
        this.phno = phno;
    }

    public Parent() {

    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + Age);
        System.out.println("phno : " + phno);
        System.out.println("place : " + place);
    }

    static void Show() {
        // System.out.println("Name : " + name);
        // System.out.println("Age : " + Age);
        // System.out.println("phno : " + phno);
        // System.out.println("place : " + place);
    }

}
