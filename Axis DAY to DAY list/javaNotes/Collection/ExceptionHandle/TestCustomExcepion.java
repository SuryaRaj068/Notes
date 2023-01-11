package Collection.ExceptionHandle;

public class TestCustomExcepion {
    String message = "testing";

    public static void main(String args[]) {
        TestCustomExcepion name = null;
        try {
            if (name == null) {
                throw new CustomException();
            }
            System.out.println(name.message);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

}
