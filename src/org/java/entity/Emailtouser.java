package org.java.entity;

public class Emailtouser {
    private Integer id;

    private Integer eamilid;

    private String userid;

    private Integer ifread;

    private Integer ifdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEamilid() {
        return eamilid;
    }

    public void setEamilid(Integer eamilid) {
        this.eamilid = eamilid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getIfread() {
        return ifread;
    }

    public void setIfread(Integer ifread) {
        this.ifread = ifread;
    }

    public Integer getIfdel() {
        return ifdel;
    }

    public void setIfdel(Integer ifdel) {
        this.ifdel = ifdel;
    }
}