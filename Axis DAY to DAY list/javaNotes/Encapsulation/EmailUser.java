package Encapsulation;

public class EmailUser {
    private String userName = "surya068";
    private String password = "surya@123";

    public String getPassword() {
        return password;
    }

    // get and set
    String getUserName() {
        return this.userName;
    }

    void setPassword(String newpassword) {
        this.password = newpassword;
    }

}
