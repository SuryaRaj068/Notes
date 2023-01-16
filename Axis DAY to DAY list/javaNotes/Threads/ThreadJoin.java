package Threads;

public class ThreadJoin extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            // Thread.currentThread().wait(1000);
            System.out.println(Thread.currentThread().getState());

        }
    }
}