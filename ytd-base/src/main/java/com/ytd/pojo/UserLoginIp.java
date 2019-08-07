package com.ytd.pojo;

import java.util.Date;

public class UserLoginIp {
    private Integer ipid;

    private Integer userid;

    private Integer loginip;

    private Short browsertype;

    private Short ostype;

    private String loginaddress;

    private Date logintime;

    private String area;

    public Integer getIpid() {
        return ipid;
    }

    public void setIpid(Integer ipid) {
        this.ipid = ipid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getLoginip() {
        return loginip;
    }

    public void setLoginip(Integer loginip) {
        this.loginip = loginip;
    }

    public Short getBrowsertype() {
        return browsertype;
    }

    public void setBrowsertype(Short browsertype) {
        this.browsertype = browsertype;
    }

    public Short getOstype() {
        return ostype;
    }

    public void setOstype(Short ostype) {
        this.ostype = ostype;
    }

    public String getLoginaddress() {
        return loginaddress;
    }

    public void setLoginaddress(String loginaddress) {
        this.loginaddress = loginaddress == null ? null : loginaddress.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
}