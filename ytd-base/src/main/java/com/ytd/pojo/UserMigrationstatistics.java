package com.ytd.pojo;

public class UserMigrationstatistics {
    private Integer id;

    private Integer userid;

    private String isagree;

    private String spare;

    private String spare1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIsagree() {
        return isagree;
    }

    public void setIsagree(String isagree) {
        this.isagree = isagree == null ? null : isagree.trim();
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare == null ? null : spare.trim();
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1 == null ? null : spare1.trim();
    }
}