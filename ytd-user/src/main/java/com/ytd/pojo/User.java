package com.ytd.pojo;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="user_main")
public class User implements Serializable {


    @Id
    public Integer userId;//用户id

    public String email;//邮件，要求唯一
    public String nickName;//用户昵称，要求唯一
    public String realName;//真实姓名
    public String idCardNo;//身份证号
    public String passwd;//密码
    public String payPassword;//支付密码
    public Integer isPwdSet;//是否设置交易密码
    public String mobile;//已绑定的手机号码，不要求唯一
    public String jxmobile;//江西银行预留的手机号
    public String city;//所在城市,改为商户的企业证件号
    public Date registerTime;//注册时间
    public Integer roles;//角色，参见com.zkbc.core.consts.user.UserRolesType
    public Double cash;//可用现金余额  这条记录中的值才是用户真正可用的钱
    public Double currBal;//账面余额
    public Double frozenWithDrawCash;//已冻结的提现中现金
    public Double frozenBiddingCash;//已冻结的投标中现金
    public Integer  idVerifyLimit;//国政通验证次数，每次验证减1，默认每人最多验证3次
    public Integer  portrait;//头像id
    public Integer  status;//用户状态。用数值型的好处是今后可以扩充定义，参见com.zkbc.core.consts.user.UserStatusType
    public Integer  forbidStatus;//禁止状态。参见com.zkbc.core.consts.user.UserForbidStatusType
    public Integer  albumCapacity;//个人相册容量，单位：MB。用户所有的userpic加起来不能大于此数值
    public Integer  securityLevel;//安全等级
    public String weiboUId;//新浪微博uid
    public String weiboAccessToken;//新浪微博AccessToken
    public String qqUId;//腾讯uid
    public String qqAccessToken;//腾讯AccessToken
    public Integer origin;//借款用户的渠道
    public Integer  staffId;//所属客户经理,改为是否为员工,1为是员工
    public String userCode;//第三方支付账号
    public String referee;//推荐人，存储推荐人用户名
    public Date level_update_time;//级别更新时间
    public String level;//0 普通用户  1 普通猪粉  2 超级猪粉
    public Date bindtime;//
    public String loginkey;//天眼登录校验标识
    public String userkey;//天眼绑定标识
    public String cashChl;//取现方式ID




    @Id
    @Column(name="userid")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public Integer getIsPwdSet() {
        return isPwdSet;
    }

    public void setIsPwdSet(Integer isPwdSet) {
        this.isPwdSet = isPwdSet;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getJxmobile() {
        return jxmobile;
    }

    public void setJxmobile(String jxmobile) {
        this.jxmobile = jxmobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getRoles() {
        return roles;
    }

    public void setRoles(Integer roles) {
        this.roles = roles;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double getCurrBal() {
        return currBal;
    }

    public void setCurrBal(Double currBal) {
        this.currBal = currBal;
    }

    public Double getFrozenWithDrawCash() {
        return frozenWithDrawCash;
    }

    public void setFrozenWithDrawCash(Double frozenWithDrawCash) {
        this.frozenWithDrawCash = frozenWithDrawCash;
    }

    public Double getFrozenBiddingCash() {
        return frozenBiddingCash;
    }

    public void setFrozenBiddingCash(Double frozenBiddingCash) {
        this.frozenBiddingCash = frozenBiddingCash;
    }

    public Integer getIdVerifyLimit() {
        return idVerifyLimit;
    }

    public void setIdVerifyLimit(Integer idVerifyLimit) {
        this.idVerifyLimit = idVerifyLimit;
    }

    public Integer getPortrait() {
        return portrait;
    }

    public void setPortrait(Integer portrait) {
        this.portrait = portrait;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getForbidStatus() {
        return forbidStatus;
    }

    public void setForbidStatus(Integer forbidStatus) {
        this.forbidStatus = forbidStatus;
    }

    public Integer getAlbumCapacity() {
        return albumCapacity;
    }

    public void setAlbumCapacity(Integer albumCapacity) {
        this.albumCapacity = albumCapacity;
    }

    public Integer getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getWeiboUId() {
        return weiboUId;
    }

    public void setWeiboUId(String weiboUId) {
        this.weiboUId = weiboUId;
    }

    public String getWeiboAccessToken() {
        return weiboAccessToken;
    }

    public void setWeiboAccessToken(String weiboAccessToken) {
        this.weiboAccessToken = weiboAccessToken;
    }

    public String getQqUId() {
        return qqUId;
    }

    public void setQqUId(String qqUId) {
        this.qqUId = qqUId;
    }

    public String getQqAccessToken() {
        return qqAccessToken;
    }

    public void setQqAccessToken(String qqAccessToken) {
        this.qqAccessToken = qqAccessToken;
    }

    public Integer getOrigin() {
        return origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public Date getLevel_update_time() {
        return level_update_time;
    }

    public void setLevel_update_time(Date level_update_time) {
        this.level_update_time = level_update_time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
        this.loginkey = loginkey;
    }

    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey;
    }

    public String getCashChl() {
        return cashChl;
    }

    public void setCashChl(String cashChl) {
        this.cashChl = cashChl;
    }
}
