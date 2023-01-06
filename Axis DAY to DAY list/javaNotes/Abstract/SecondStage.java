package Abstract;

public class SecondStage extends AbstactClass {

    @Override
    void call() {
        // TODO Auto-generated method stub
        System.out.println("Call that person");

    }

    void call(String name) {

    }

    public static void main(String args[]) {
        SecondStage obj = new SecondStage();
    }

}
