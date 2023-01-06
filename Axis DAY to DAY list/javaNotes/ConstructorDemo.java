public class ConstructorDemo {
    String userName;
    String userPlace;
    int userAge;

    public ConstructorDemo(String userName, int userAge, String userPlace) {//
        this();
        // this(userName, userAge);

        this.userName = userName;
        this.userAge = userAge;
        this.userPlace = userPlace;

        System.out.println("Constructure is called");
    }

    ConstructorDemo() {

        System.out.println("default Constructure is called");
    }

    ConstructorDemo(String userName, int userAge) {
        // this(userName, userAge,"");
        this();
        this.userName = userName;
        this.userAge = userAge;
    }

    public static void main(String args[]) {
        ConstructorDemo obj = new ConstructorDemo("surya", 28, "Delhi");
        // obj.userAge = 28;
        // obj.userName = "surya";
        // obj.userPlace = "delhi";
        ConstructorDemo manoj = new ConstructorDemo("manoj", 21, "Delhi");
        ConstructorDemo obj2 = new ConstructorDemo();
        ConstructorDemo obj3 = new ConstructorDemo("Ashok", 21);
        // methodName();
        // manoj.userAge = 21;
        // manoj.userName = "Manoj";
        // manoj.userPlace = "delhi";
        // System.out.println(manoj.userName);
        // System.out.println(manoj.userAge);
        // System.out.println(manoj.userPlace);
        obj.show(obj);
        manoj.show(manoj);
    }

    void show(ConstructorDemo manoj) {
        String userName = "";
        System.out.println(manoj.userName);// this.userName obj.userName manoj.userName
        System.out.println(this.userAge);
        System.out.println(this.userPlace);
        System.out.println(manoj.userAge);

    }
}
