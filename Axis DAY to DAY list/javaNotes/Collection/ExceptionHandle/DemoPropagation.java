package Collection.ExceptionHandle;

public class DemoPropagation {
    String name;

    void m() {
        int num = 10 / 2;
    }

    void p() {
        m();
    }

    void show() {
        DemoPropagation demo = null;
        System.out.println(demo.name);
    }

    public static void main(String args[]) {
        DemoPropagation demo = new DemoPropagation();
        try {
            demo.p();
            demo.show();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}
