package eugenehenneberry.cs.lewisu.finalproject;

public class Password {

    private String passName;
    private String passUrl;
    private String passLogin;
    private String password;
    private int passCategory;
    private String uid;


    public Password(String passName, String passUrl, String passLogin, String password, int passCategory, String uid) {
        this.passName = passName;
        this.passUrl = passUrl;
        this.passLogin = passLogin;
        this.password = password;
        this.passCategory = passCategory;
        this.uid = uid;
    }

    public Password() {

    }

    public Password(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public String getPassUrl() {
        return passUrl;
    }

    public void setPassUrl(String passUrl) {
        this.passUrl = passUrl;
    }

    public String getPassLogin() {
        return passLogin;
    }

    public void setPassLogin(String passLogin) {
        this.passLogin = passLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPassCategory() {
        return passCategory;
    }

    public void setPassCategory(int passCategory) {
        this.passCategory = passCategory;
    }
}