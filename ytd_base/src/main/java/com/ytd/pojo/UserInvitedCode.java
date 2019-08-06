package com.ytd.pojo;

public class UserInvitedCode {
    private Integer userid;

    private String inviterusercode;

    private Integer companycodeid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getInviterusercode() {
        return inviterusercode;
    }

    public void setInviterusercode(String inviterusercode) {
        this.inviterusercode = inviterusercode == null ? null : inviterusercode.trim();
    }

    public Integer getCompanycodeid() {
        return companycodeid;
    }

    public void setCompanycodeid(Integer companycodeid) {
        this.companycodeid = companycodeid;
    }
}