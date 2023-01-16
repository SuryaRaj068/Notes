package Threads;

public class ThreadJoinDemo {
    public static void main(String args[]) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        t1.start();
        try {
            t2.wait(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // try {
        // t1.join();
        // } catch (InterruptedException e1) {
        // // TODO Auto-generated catch block
        // e1.printStackTrace();
        // }
        t2.start();
        // try {
        // t2.join();
        // } catch (InterruptedException e) {
        // System.out.println(e.getMessage());
        // }
        t3.start();
    }
}
