package org.java.entity;

public class Userinfo {
    private String userid;

    private String name;

    private String username;

    private String password;

    private Integer departid;

    private Integer gender;

    private String email;

    private String photopath;

    private String userdesc;

    private Integer roleid;

    private Integer userstateid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath == null ? null : photopath.trim();
    }

    public String getUserdesc() {
        return userdesc;
    }

    public void setUserdesc(String userdesc) {
        this.userdesc = userdesc == null ? null : userdesc.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUserstateid() {
        return userstateid;
    }

    public void setUserstateid(Integer userstateid) {
        this.userstateid = userstateid;
    }
}