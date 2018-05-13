package org.java.entity;

import java.util.Date;

public class Eamil {
    private Integer eamilid;

    private String title;

    private String eamilcontent;

    private String fromuserid;

    private Integer ifpublish;

    private Date recordtime;

    private Integer eamiltypeid;

    public Integer getEamilid() {
        return eamilid;
    }

    public void setEamilid(Integer eamilid) {
        this.eamilid = eamilid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getEamilcontent() {
        return eamilcontent;
    }

    public void setEamilcontent(String eamilcontent) {
        this.eamilcontent = eamilcontent == null ? null : eamilcontent.trim();
    }

    public String getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(String fromuserid) {
        this.fromuserid = fromuserid == null ? null : fromuserid.trim();
    }

    public Integer getIfpublish() {
        return ifpublish;
    }

    public void setIfpublish(Integer ifpublish) {
        this.ifpublish = ifpublish;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public Integer getEamiltypeid() {
        return eamiltypeid;
    }

    public void setEamiltypeid(Integer eamiltypeid) {
        this.eamiltypeid = eamiltypeid;
    }
}