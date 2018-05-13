package org.java.entity;

public class Userrole {
    private Integer userroleid;

    private String userid;

    private Integer roleid;

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}