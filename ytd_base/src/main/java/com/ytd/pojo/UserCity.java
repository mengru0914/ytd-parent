package com.ytd.pojo;

public class UserCity {
    private Integer userid;

    private String residenceprovince;

    private String residencecity;

    private String residencecounty;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getResidenceprovince() {
        return residenceprovince;
    }

    public void setResidenceprovince(String residenceprovince) {
        this.residenceprovince = residenceprovince == null ? null : residenceprovince.trim();
    }

    public String getResidencecity() {
        return residencecity;
    }

    public void setResidencecity(String residencecity) {
        this.residencecity = residencecity == null ? null : residencecity.trim();
    }

    public String getResidencecounty() {
        return residencecounty;
    }

    public void setResidencecounty(String residencecounty) {
        this.residencecounty = residencecounty == null ? null : residencecounty.trim();
    }
}