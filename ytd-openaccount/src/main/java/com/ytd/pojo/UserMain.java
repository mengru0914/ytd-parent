package com.ytd.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="user_main")
public class UserMain implements Serializable {

    public Integer userid;

    public String email;

    public String nickname;

    public String realname;

    public String idcardno;

    public String passwd;

    public String paypassword;

    public Integer ispwdset;

    public String mobile;

    public String jxmobile;

    public String city;

    public Date registertime;

    public Short roles;

    public BigDecimal cash;

    public BigDecimal currbal;

    public BigDecimal frozenwithdrawcash;

    public BigDecimal frozenbiddingcash;

    public Short idverifylimit;

    public Integer portrait;

    public Short status;

    public Short forbidstatus;

    public Short albumcapacity;

    public Short securitylevel;

    public String weibouid;

    public String weiboaccesstoken;

    public String qquid;

    public String qqaccesstoken;

    public Short origin;

    public Integer staffid;

    public String usercode;

    public String referee;

    public Date levelUpdateTime;

    public String level;

    public Date bindtime;

    public String loginkey;

    public String userkey;

    public String cashchl;

    @Id
    @Column(name="userid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    public Integer getIspwdset() {
        return ispwdset;
    }

    public void setIspwdset(Integer ispwdset) {
        this.ispwdset = ispwdset;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getJxmobile() {
        return jxmobile;
    }

    public void setJxmobile(String jxmobile) {
        this.jxmobile = jxmobile == null ? null : jxmobile.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Short getRoles() {
        return roles;
    }

    public void setRoles(Short roles) {
        this.roles = roles;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getCurrbal() {
        return currbal;
    }

    public void setCurrbal(BigDecimal currbal) {
        this.currbal = currbal;
    }

    public BigDecimal getFrozenwithdrawcash() {
        return frozenwithdrawcash;
    }

    public void setFrozenwithdrawcash(BigDecimal frozenwithdrawcash) {
        this.frozenwithdrawcash = frozenwithdrawcash;
    }

    public BigDecimal getFrozenbiddingcash() {
        return frozenbiddingcash;
    }

    public void setFrozenbiddingcash(BigDecimal frozenbiddingcash) {
        this.frozenbiddingcash = frozenbiddingcash;
    }

    public Short getIdverifylimit() {
        return idverifylimit;
    }

    public void setIdverifylimit(Short idverifylimit) {
        this.idverifylimit = idverifylimit;
    }

    public Integer getPortrait() {
        return portrait;
    }

    public void setPortrait(Integer portrait) {
        this.portrait = portrait;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getForbidstatus() {
        return forbidstatus;
    }

    public void setForbidstatus(Short forbidstatus) {
        this.forbidstatus = forbidstatus;
    }

    public Short getAlbumcapacity() {
        return albumcapacity;
    }

    public void setAlbumcapacity(Short albumcapacity) {
        this.albumcapacity = albumcapacity;
    }

    public Short getSecuritylevel() {
        return securitylevel;
    }

    public void setSecuritylevel(Short securitylevel) {
        this.securitylevel = securitylevel;
    }

    public String getWeibouid() {
        return weibouid;
    }

    public void setWeibouid(String weibouid) {
        this.weibouid = weibouid == null ? null : weibouid.trim();
    }

    public String getWeiboaccesstoken() {
        return weiboaccesstoken;
    }

    public void setWeiboaccesstoken(String weiboaccesstoken) {
        this.weiboaccesstoken = weiboaccesstoken == null ? null : weiboaccesstoken.trim();
    }

    public String getQquid() {
        return qquid;
    }

    public void setQquid(String qquid) {
        this.qquid = qquid == null ? null : qquid.trim();
    }

    public String getQqaccesstoken() {
        return qqaccesstoken;
    }

    public void setQqaccesstoken(String qqaccesstoken) {
        this.qqaccesstoken = qqaccesstoken == null ? null : qqaccesstoken.trim();
    }

    public Short getOrigin() {
        return origin;
    }

    public void setOrigin(Short origin) {
        this.origin = origin;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee == null ? null : referee.trim();
    }

    public Date getLevelUpdateTime() {
        return levelUpdateTime;
    }

    public void setLevelUpdateTime(Date levelUpdateTime) {
        this.levelUpdateTime = levelUpdateTime;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Date getBindtime() {
        return bindtime;
    }

    public void setBindtime(Date bindtime) {
        this.bindtime = bindtime;
    }

    public String getLoginkey() {
        return loginkey;
    }

    public void setLoginkey(String loginkey) {
        this.loginkey = loginkey == null ? null : loginkey.trim();
    }

    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey == null ? null : userkey.trim();
    }

    public String getCashchl() {
        return cashchl;
    }

    public void setCashchl(String cashchl) {
        this.cashchl = cashchl == null ? null : cashchl.trim();
    }
}