package org.java.entity;

public class Messagetouser {
    private Integer id;

    private Integer messageid;

    private String userid;

    private Integer ifread;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
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
}