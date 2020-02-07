package pojo;

public class Quartercheck {
    private String qcdate;

    private String qctu;

    private String qcoe;

    private String qcrm;

    private String qcst;

    private String qcpr;

    public String getQcdate() {
        return qcdate;
    }

    public void setQcdate(String qcdate) {
        this.qcdate = qcdate == null ? null : qcdate.trim();
    }

    public String getQctu() {
        return qctu;
    }

    public void setQctu(String qctu) {
        this.qctu = qctu == null ? null : qctu.trim();
    }

    public String getQcoe() {
        return qcoe;
    }

    public void setQcoe(String qcoe) {
        this.qcoe = qcoe == null ? null : qcoe.trim();
    }

    public String getQcrm() {
        return qcrm;
    }

    public void setQcrm(String qcrm) {
        this.qcrm = qcrm == null ? null : qcrm.trim();
    }

    public String getQcst() {
        return qcst;
    }

    public void setQcst(String qcst) {
        this.qcst = qcst == null ? null : qcst.trim();
    }

    public String getQcpr() {
        return qcpr;
    }

    public void setQcpr(String qcpr) {
        this.qcpr = qcpr == null ? null : qcpr.trim();
    }
}