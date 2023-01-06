import java.util.Scanner;

class FirstProgram {
    String name;

    public static void main(String args[]) {
        int age = 20;
        // if (age == 18) {
        // System.out.println("age " + age);
        // }
        // switch (age) {
        // case 18:
        // System.out.println(age);
        // break;
        // case 19:
        // System.out.println(age);
        // break;
        // default:
        // System.out.println("wrong choice");

        // }
        // for (int i = 10; i <= 100; i += 10) {
        // System.out.println(i);
        // }
        // System.out.println("after for loop");
        // 10 20 30 40 50 60 70 80 90
        // 10
        // infi loop

        // VariableType obj1 = new VariableType();
        // System.out.println(obj1.place);
        int i = 0;
        String username = "surya";
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        while (!username.equals(userInput)) {
            System.out.println("enter the user name");
            // input
            userInput = sc.next();
        }
        do {
            System.out.println("enter the user name");
            // input
            userInput = sc.next();
        } while (!username.equals(userInput));

        // 0
    }

    // void createUser(userInfo user) {
    // Scanner sc = new Scanner(System.in);
    // System.err.println("enter name");
    // user.name = sc.next();
    // }

}

// create a facebook account

// register
// enter a unic user name
// input user name
// user name is taken