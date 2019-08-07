package com.ytd.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user_jx_main")
public class UserJxMain implements Serializable {
    public Integer id;

    public Integer userid;

    public String username;

    public String useridno;

    public String usermobile;

    public String usercardno;

    public String useraccountid;

    public String acqres;

    public String acqres1;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUseridno() {
        return useridno;
    }

    public void setUseridno(String useridno) {
        this.useridno = useridno == null ? null : useridno.trim();
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile == null ? null : usermobile.trim();
    }

    public String getUsercardno() {
        return usercardno;
    }

    public void setUsercardno(String usercardno) {
        this.usercardno = usercardno == null ? null : usercardno.trim();
    }

    public String getUseraccountid() {
        return useraccountid;
    }

    public void setUseraccountid(String useraccountid) {
        this.useraccountid = useraccountid == null ? null : useraccountid.trim();
    }

    public String getAcqres() {
        return acqres;
    }

    public void setAcqres(String acqres) {
        this.acqres = acqres == null ? null : acqres.trim();
    }

    public String getAcqres1() {
        return acqres1;
    }

    public void setAcqres1(String acqres1) {
        this.acqres1 = acqres1 == null ? null : acqres1.trim();
    }
}