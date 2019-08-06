package com.ytd.pojo;

import java.util.Date;

public class UserLoginFailure {
    private Integer userid;

    private Integer attempttimes;

    private Date lastattemped;

    private Date lastlocked;

    private Integer lastloginip;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAttempttimes() {
        return attempttimes;
    }

    public void setAttempttimes(Integer attempttimes) {
        this.attempttimes = attempttimes;
    }

    public Date getLastattemped() {
        return lastattemped;
    }

    public void setLastattemped(Date lastattemped) {
        this.lastattemped = lastattemped;
    }

    public Date getLastlocked() {
        return lastlocked;
    }

    public void setLastlocked(Date lastlocked) {
        this.lastlocked = lastlocked;
    }

    public Integer getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(Integer lastloginip) {
        this.lastloginip = lastloginip;
    }
}