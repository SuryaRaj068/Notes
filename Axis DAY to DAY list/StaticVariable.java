public class StaticVariable {
    static int age = 18; // memory of that static member will const
    int num = 10;

    public static void main(String args[]) {
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        obj1.num = 20;
        obj2.num = 30;
        System.out.println(obj1.num);// 20
        System.out.println(obj2.num);// 30
        obj1.age = 19;
        obj2.age = 30;
        obj1.show();
        System.out.println(obj1.age);// 30
        System.out.println(obj2.age);// 30
    }

    public static void show() {

    }

}
