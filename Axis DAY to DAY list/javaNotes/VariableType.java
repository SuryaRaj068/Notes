
public class VariableType {
    String name;// global
    public static String place = "mysore";

    public static void main(String args[]) {
        System.out.println(place);
        int age1 = 20;
        display(age1);
        VariableType obj1 = new VariableType();
        obj1.show();

    }

    public static void display(int age) {
        System.out.println("the static method");
    }

    public void show() {
        int age = 10;// scope of variable
        System.out.println(age);
        System.out.println(name);
        VariableType obje1 = new VariableType();
        obje1.place = "banglore";
        VariableType obje2 = new VariableType();
        obje2.place = "mysore";
    }
}
