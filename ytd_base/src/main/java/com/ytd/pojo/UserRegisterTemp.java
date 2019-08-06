package com.ytd.pojo;

import java.util.Date;

public class UserRegisterTemp {
    private Integer id;

    private String email;

    private String nickname;

    private String passwd;

    private Date registertime;

    private Short roles;

    private String question;

    private String answer;

    private String weibouid;

    private String weiboaccesstoken;

    private String qquid;

    private String qqaccesstoken;

    private Short origin;

    private Integer staffid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
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
}