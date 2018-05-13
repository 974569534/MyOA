package org.java.entity;

public class Readcommonmessage {
    private Integer readid;

    private Integer messageid;

    private String userid;

    public Integer getReadid() {
        return readid;
    }

    public void setReadid(Integer readid) {
        this.readid = readid;
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
}