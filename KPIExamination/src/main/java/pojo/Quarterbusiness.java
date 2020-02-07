package pojo;

public class Quarterbusiness {
    private String qdate;

    private String qtu;

    private String qoe;

    private String qrm;

    private String qst;

    private String qpr;

    public String getQdate() {
        return qdate;
    }

    public void setQdate(String qdate) {
        this.qdate = qdate == null ? null : qdate.trim();
    }

    public String getQtu() {
        return qtu;
    }

    public void setQtu(String qtu) {
        this.qtu = qtu == null ? null : qtu.trim();
    }

    public String getQoe() {
        return qoe;
    }

    public void setQoe(String qoe) {
        this.qoe = qoe == null ? null : qoe.trim();
    }

    public String getQrm() {
        return qrm;
    }

    public void setQrm(String qrm) {
        this.qrm = qrm == null ? null : qrm.trim();
    }

    public String getQst() {
        return qst;
    }

    public void setQst(String qst) {
        this.qst = qst == null ? null : qst.trim();
    }

    public String getQpr() {
        return qpr;
    }

    public void setQpr(String qpr) {
        this.qpr = qpr == null ? null : qpr.trim();
    }
}