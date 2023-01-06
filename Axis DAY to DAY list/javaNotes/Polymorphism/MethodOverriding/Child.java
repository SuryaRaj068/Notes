package Polymorphism.MethodOverriding;

import java.util.HashMap;
import java.util.Map;

public class Child extends Parent {
    void show() {
        System.out.println("Welcome to java class by child");
    }

    public static void main(String args[]) {
        Child chilobj = (Child) new Parent();
        // chilobj.call();
        Parent child = new Parent(); // parent
        // Child child= new Parent();//parentobj
        child.show();
        // child.call();
        Map map = new HashMap<>();// collection
        child.show();

    }

    void call() {
        this.show();
        // super.show();
    }
}
