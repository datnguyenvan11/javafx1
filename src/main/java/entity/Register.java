package entity;

public class Register {

    private String username;
    private String password;
    private String confirmpassword;
    private String email;
    private String phone;
    private String fullname;

    public Register() {
    }

    public Register(String username, String password, String confirmpassword, String email, String phone, String fullname) {
        this.username = username;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.email = email;
        this.phone = phone;
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}


