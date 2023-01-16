package Threads;

public class ThreadDemoUsingThreadClass {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        // System.out.println(t1.getState());
        t1.setPriority(9);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }

}
