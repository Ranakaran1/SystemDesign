package Entity;


public class User {
    private String name;
    private String email;
    public String AadharNumber;
    public boolean hasDL;

    public User(){}
    public User(String name, String email, String aadharNumber, boolean hasDL) {
        this.name = name;
        this.email = email;
        AadharNumber = aadharNumber;
        this.hasDL = hasDL;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAadharNumber() {
        return AadharNumber;
    }
    public void setAadharNumber(String aadharNumber) {
        AadharNumber = aadharNumber;
    }
    public boolean isHasDL() {
        return hasDL;
    }
    public void setHasDL(boolean hasDL) {
        this.hasDL = hasDL;
    }



}
