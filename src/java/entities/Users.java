package entities;

public class Users {
    
    private int uid;
    private String uusername;
    private String upassword;
    private String ulastlogindt;
    private String uloginip;

    public Users() {
    }

    public Users(int uid, String uusername, String upassword, String ulastlogindt, String uloginip) {
        this.uid = uid;
        this.uusername = uusername;
        this.upassword = upassword;
        this.ulastlogindt = ulastlogindt;
        this.uloginip = uloginip;
    }

    public Users(String uusername, String upassword, String ulastlogindt, String uloginip) {
        this.uusername = uusername;
        this.upassword = upassword;
        this.ulastlogindt = ulastlogindt;
        this.uloginip = uloginip;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUlastlogindt() {
        return ulastlogindt;
    }

    public void setUlastlogindt(String ulastlogindt) {
        this.ulastlogindt = ulastlogindt;
    }

    public String getUloginip() {
        return uloginip;
    }

    public void setUloginip(String uloginip) {
        this.uloginip = uloginip;
    }

    @Override
    public String toString() {
        return "Users{" + "uid=" + uid + ", uusername=" + uusername + ", upassword=" + upassword + ", ulastlogindt=" + ulastlogindt + ", uloginip=" + uloginip + '}';
    }
    
}
