package pojo;

public class User {
    private String userid;

    private String userpassword;

    private String userright;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUserright() {
        return userright;
    }

    public void setUserright(String userright) {
        this.userright = userright == null ? null : userright.trim();
    }
}