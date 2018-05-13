package org.java.entity;

public class Messagetype {
    private Integer messagetypeid;

    private String messagetypename;

    private String messagedesc;

    public Integer getMessagetypeid() {
        return messagetypeid;
    }

    public void setMessagetypeid(Integer messagetypeid) {
        this.messagetypeid = messagetypeid;
    }

    public String getMessagetypename() {
        return messagetypename;
    }

    public void setMessagetypename(String messagetypename) {
        this.messagetypename = messagetypename == null ? null : messagetypename.trim();
    }

    public String getMessagedesc() {
        return messagedesc;
    }

    public void setMessagedesc(String messagedesc) {
        this.messagedesc = messagedesc == null ? null : messagedesc.trim();
    }
}