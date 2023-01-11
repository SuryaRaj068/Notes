package InterFace;

//sharath
public interface MessageInterface {
    String message = "";

    void sendmessage(String message);

    void reciveMessage();

    void replay();

    default void notification() {
        System.out.println("notify");
    }
}
