package org.java.entity;

public class Departinfo {
    private Integer departid;

    private String departname;

    private String userid;

    private String connecttelno;

    private String connectmobiletelno;

    private String faxes;

    private Integer branchid;

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getConnecttelno() {
        return connecttelno;
    }

    public void setConnecttelno(String connecttelno) {
        this.connecttelno = connecttelno == null ? null : connecttelno.trim();
    }

    public String getConnectmobiletelno() {
        return connectmobiletelno;
    }

    public void setConnectmobiletelno(String connectmobiletelno) {
        this.connectmobiletelno = connectmobiletelno == null ? null : connectmobiletelno.trim();
    }

    public String getFaxes() {
        return faxes;
    }

    public void setFaxes(String faxes) {
        this.faxes = faxes == null ? null : faxes.trim();
    }

    public Integer getBranchid() {
        return branchid;
    }

    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }
}