package pojo;

public class Monthbusiness {
    private String mdate;

    private String mtu;

    private String moe;

    private String mrm;

    private String mst;

    private String mpr;

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate == null ? null : mdate.trim();
    }

    public String getMtu() {
        return mtu;
    }

    public void setMtu(String mtu) {
        this.mtu = mtu == null ? null : mtu.trim();
    }

    public String getMoe() {
        return moe;
    }

    public void setMoe(String moe) {
        this.moe = moe == null ? null : moe.trim();
    }

    public String getMrm() {
        return mrm;
    }

    public void setMrm(String mrm) {
        this.mrm = mrm == null ? null : mrm.trim();
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst == null ? null : mst.trim();
    }

    public String getMpr() {
        return mpr;
    }

    public void setMpr(String mpr) {
        this.mpr = mpr == null ? null : mpr.trim();
    }
}