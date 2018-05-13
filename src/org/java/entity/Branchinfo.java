package org.java.entity;

public class Branchinfo {
    private Integer branchid;

    private String branchname;

    private String branchshortname;

    public Integer getBranchid() {
        return branchid;
    }

    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname == null ? null : branchname.trim();
    }

    public String getBranchshortname() {
        return branchshortname;
    }

    public void setBranchshortname(String branchshortname) {
        this.branchshortname = branchshortname == null ? null : branchshortname.trim();
    }
}