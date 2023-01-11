package InterFace;

public class MessageApp implements MessageInterface, userInfo {
    public void sendmessage(String message) {
        System.out.println("send message");
    }

    public void reciveMessage() {
        System.out.println("recive message");
    }

    public void replay() {
        System.err.println("replay to that message");
    }

    public void notification() {

    }

    @Override
    public void userList() {
        System.out.println("userInfo list");

    }

    @Override
    public void userNumber() {
        System.out.println("user phno");

    }

    @Override
    public void friendList() {
        System.out.println("list of friend");

    }

}
