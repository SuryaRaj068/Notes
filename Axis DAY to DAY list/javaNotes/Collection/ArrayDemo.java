package Collection;

public class ArrayDemo {
    String name;
    int age;
    String place;
    String collage;
    ArrayDemo array[] = new ArrayDemo[10];
    int count = 0;

    public static void main(String args[]) {
        String name = "";
        try {
            name.charAt(0);
        } catch (Exception e) {
            System.out.print("");
        }
        // int array[] = new int[10];
        // ArrayDemo arrayDemos[] = new ArrayDemo[7];

        // array[0] = 10;
        // array[1] = 20;
        // array[2] = 30;
        // System.out.println(array);
        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }
        // // System.out.println(array.toString());
        // for (int el : array) {
        // System.out.println(el);
        // }
        // show(new int[] { 1, 2, 3, 4, 6 });
        // ArrayDemo arrayDemo = new ArrayDemo();
        // while (true) {
        // switch (1) {
        // case 1:
        // addStudent();
        // case 2:
        // display();
        // case 3:
        // exit();
        // }
        // }

    }

    void addStudent() {
        if (count < array.length) {
            ArrayDemo std1 = new ArrayDemo();
            std1.name = "surya";
            std1.age = 27;
            std1.place = "delhi";
            std1.collage = "NIT";
            array[count] = std1;
            count++;
        } else {
            System.out.println("no more student can be taken");
        }
        // array[1]=std2;

    }

    void display() {
        ArrayDemo std1 = array[0];
        // std1.name;

    }

    public static void show(int array[]) {
        int array1[] = array.clone();
        System.arraycopy(array1, 0, array, 0, array.length);
    }

}
