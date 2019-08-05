package com.ytd.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user_main")
public class User implements Serializable {


    private Integer userid;
    private String mobile;
    private String passwd;


    @Id
    @Column(name="userid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
