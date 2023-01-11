package Collection.ExceptionHandle;

public class ArithmeticExceptionDemo {
    public static void main(String args[]) {
        int a = 10;
        int b = 2;
        String s = null;
        try {
            int c = a / b;
            System.out.println(c);
            s.length();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }
        System.out.print("After exception");
    }
}
