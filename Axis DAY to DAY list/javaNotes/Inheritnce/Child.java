package Inheritnce;

public class Child extends Parent {
    String childName;
    private byte childAge;
    private long ChildPhno;

    public Child(String childName, byte childAge, long childPhno, int parentAge, long parentPhno) {
        super(parentAge, parentPhno);
        super.name = name;
        super.place = place;
        this.childName = childName;
        this.childAge = childAge;
        this.ChildPhno = childPhno;
    }

    public static void main(String args[]) {
        // Parent parent=new Parent();
        // super
        Child childobj = new Child("Surya", (byte) 28, (long) 8884883735l, 40, (long) 988076743);
        childobj.display();
    }

}
