package org.java.entity;

import java.util.Date;

public class Mynote {
    private Integer noteid;

    private String notetitle;

    private String notecontent;

    private Date createtime;

    private String createuser;

    public Integer getNoteid() {
        return noteid;
    }

    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    public String getNotetitle() {
        return notetitle;
    }

    public void setNotetitle(String notetitle) {
        this.notetitle = notetitle == null ? null : notetitle.trim();
    }

    public String getNotecontent() {
        return notecontent;
    }

    public void setNotecontent(String notecontent) {
        this.notecontent = notecontent == null ? null : notecontent.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }
}