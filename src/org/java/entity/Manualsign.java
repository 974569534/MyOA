package org.java.entity;

import java.util.Date;

public class Manualsign {
    private Integer signid;

    private String userid;

    private Date signtime;

    private String signdesc;

    private Integer signtag;

    public Integer getSignid() {
        return signid;
    }

    public void setSignid(Integer signid) {
        this.signid = signid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public String getSigndesc() {
        return signdesc;
    }

    public void setSigndesc(String signdesc) {
        this.signdesc = signdesc == null ? null : signdesc.trim();
    }

    public Integer getSigntag() {
        return signtag;
    }

    public void setSigntag(Integer signtag) {
        this.signtag = signtag;
    }
}