package pojo;

public class Monthcheck {
    private String mcdate;

    private String mcde;

    private String mcpr;

    private String mcmc;

    private String mcip;

    private String mcfc;

    public String getMcdate() {
        return mcdate;
    }

    public void setMcdate(String mcdate) {
        this.mcdate = mcdate == null ? null : mcdate.trim();
    }

    public String getMcde() {
        return mcde;
    }

    public void setMcde(String mcde) {
        this.mcde = mcde == null ? null : mcde.trim();
    }

    public String getMcpr() {
        return mcpr;
    }

    public void setMcpr(String mcpr) {
        this.mcpr = mcpr == null ? null : mcpr.trim();
    }

    public String getMcmc() {
        return mcmc;
    }

    public void setMcmc(String mcmc) {
        this.mcmc = mcmc == null ? null : mcmc.trim();
    }

    public String getMcip() {
        return mcip;
    }

    public void setMcip(String mcip) {
        this.mcip = mcip == null ? null : mcip.trim();
    }

    public String getMcfc() {
        return mcfc;
    }

    public void setMcfc(String mcfc) {
        this.mcfc = mcfc == null ? null : mcfc.trim();
    }
}