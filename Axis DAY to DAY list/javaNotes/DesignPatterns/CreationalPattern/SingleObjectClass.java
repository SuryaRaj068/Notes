package DesignPatterns.CreationalPattern;

public class SingleObjectClass {
    private static SingleObjectClass singleternObject = new SingleObjectClass();

    private SingleObjectClass() {
    }

    public static SingleObjectClass getObject() {
        return singleternObject;
    }
}