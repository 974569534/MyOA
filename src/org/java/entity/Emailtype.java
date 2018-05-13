package org.java.entity;

public class Emailtype {
    private Integer emailtypeid;

    private String emailtypename;

    public Integer getEmailtypeid() {
        return emailtypeid;
    }

    public void setEmailtypeid(Integer emailtypeid) {
        this.emailtypeid = emailtypeid;
    }

    public String getEmailtypename() {
        return emailtypename;
    }

    public void setEmailtypename(String emailtypename) {
        this.emailtypename = emailtypename == null ? null : emailtypename.trim();
    }
}