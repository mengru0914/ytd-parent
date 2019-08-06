package com.ytd.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("idCardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("idCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("idCardNo =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("idCardNo <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("idCardNo >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("idCardNo >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("idCardNo <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("idCardNo <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("idCardNo like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("idCardNo not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("idCardNo in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("idCardNo not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("idCardNo between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("idCardNo not between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIsNull() {
            addCriterion("payPassword is null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIsNotNull() {
            addCriterion("payPassword is not null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordEqualTo(String value) {
            addCriterion("payPassword =", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotEqualTo(String value) {
            addCriterion("payPassword <>", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordGreaterThan(String value) {
            addCriterion("payPassword >", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("payPassword >=", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLessThan(String value) {
            addCriterion("payPassword <", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLessThanOrEqualTo(String value) {
            addCriterion("payPassword <=", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLike(String value) {
            addCriterion("payPassword like", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotLike(String value) {
            addCriterion("payPassword not like", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIn(List<String> values) {
            addCriterion("payPassword in", values, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotIn(List<String> values) {
            addCriterion("payPassword not in", values, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordBetween(String value1, String value2) {
            addCriterion("payPassword between", value1, value2, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotBetween(String value1, String value2) {
            addCriterion("payPassword not between", value1, value2, "paypassword");
            return (Criteria) this;
        }

        public Criteria andIspwdsetIsNull() {
            addCriterion("isPwdSet is null");
            return (Criteria) this;
        }

        public Criteria andIspwdsetIsNotNull() {
            addCriterion("isPwdSet is not null");
            return (Criteria) this;
        }

        public Criteria andIspwdsetEqualTo(Integer value) {
            addCriterion("isPwdSet =", value, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetNotEqualTo(Integer value) {
            addCriterion("isPwdSet <>", value, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetGreaterThan(Integer value) {
            addCriterion("isPwdSet >", value, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPwdSet >=", value, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetLessThan(Integer value) {
            addCriterion("isPwdSet <", value, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetLessThanOrEqualTo(Integer value) {
            addCriterion("isPwdSet <=", value, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetIn(List<Integer> values) {
            addCriterion("isPwdSet in", values, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetNotIn(List<Integer> values) {
            addCriterion("isPwdSet not in", values, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetBetween(Integer value1, Integer value2) {
            addCriterion("isPwdSet between", value1, value2, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andIspwdsetNotBetween(Integer value1, Integer value2) {
            addCriterion("isPwdSet not between", value1, value2, "ispwdset");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileIsNull() {
            addCriterion("jxmobile is null");
            return (Criteria) this;
        }

        public Criteria andJxmobileIsNotNull() {
            addCriterion("jxmobile is not null");
            return (Criteria) this;
        }

        public Criteria andJxmobileEqualTo(String value) {
            addCriterion("jxmobile =", value, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileNotEqualTo(String value) {
            addCriterion("jxmobile <>", value, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileGreaterThan(String value) {
            addCriterion("jxmobile >", value, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileGreaterThanOrEqualTo(String value) {
            addCriterion("jxmobile >=", value, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileLessThan(String value) {
            addCriterion("jxmobile <", value, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileLessThanOrEqualTo(String value) {
            addCriterion("jxmobile <=", value, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileLike(String value) {
            addCriterion("jxmobile like", value, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileNotLike(String value) {
            addCriterion("jxmobile not like", value, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileIn(List<String> values) {
            addCriterion("jxmobile in", values, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileNotIn(List<String> values) {
            addCriterion("jxmobile not in", values, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileBetween(String value1, String value2) {
            addCriterion("jxmobile between", value1, value2, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andJxmobileNotBetween(String value1, String value2) {
            addCriterion("jxmobile not between", value1, value2, "jxmobile");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registerTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registerTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registerTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registerTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registerTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registerTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registerTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registerTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registerTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registerTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRolesIsNull() {
            addCriterion("roles is null");
            return (Criteria) this;
        }

        public Criteria andRolesIsNotNull() {
            addCriterion("roles is not null");
            return (Criteria) this;
        }

        public Criteria andRolesEqualTo(Short value) {
            addCriterion("roles =", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotEqualTo(Short value) {
            addCriterion("roles <>", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThan(Short value) {
            addCriterion("roles >", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThanOrEqualTo(Short value) {
            addCriterion("roles >=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThan(Short value) {
            addCriterion("roles <", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThanOrEqualTo(Short value) {
            addCriterion("roles <=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesIn(List<Short> values) {
            addCriterion("roles in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotIn(List<Short> values) {
            addCriterion("roles not in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesBetween(Short value1, Short value2) {
            addCriterion("roles between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotBetween(Short value1, Short value2) {
            addCriterion("roles not between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(BigDecimal value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(BigDecimal value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(BigDecimal value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(BigDecimal value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<BigDecimal> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<BigDecimal> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCurrbalIsNull() {
            addCriterion("currBal is null");
            return (Criteria) this;
        }

        public Criteria andCurrbalIsNotNull() {
            addCriterion("currBal is not null");
            return (Criteria) this;
        }

        public Criteria andCurrbalEqualTo(BigDecimal value) {
            addCriterion("currBal =", value, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalNotEqualTo(BigDecimal value) {
            addCriterion("currBal <>", value, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalGreaterThan(BigDecimal value) {
            addCriterion("currBal >", value, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("currBal >=", value, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalLessThan(BigDecimal value) {
            addCriterion("currBal <", value, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("currBal <=", value, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalIn(List<BigDecimal> values) {
            addCriterion("currBal in", values, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalNotIn(List<BigDecimal> values) {
            addCriterion("currBal not in", values, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currBal between", value1, value2, "currbal");
            return (Criteria) this;
        }

        public Criteria andCurrbalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currBal not between", value1, value2, "currbal");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashIsNull() {
            addCriterion("frozenWithDrawCash is null");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashIsNotNull() {
            addCriterion("frozenWithDrawCash is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashEqualTo(BigDecimal value) {
            addCriterion("frozenWithDrawCash =", value, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashNotEqualTo(BigDecimal value) {
            addCriterion("frozenWithDrawCash <>", value, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashGreaterThan(BigDecimal value) {
            addCriterion("frozenWithDrawCash >", value, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozenWithDrawCash >=", value, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashLessThan(BigDecimal value) {
            addCriterion("frozenWithDrawCash <", value, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozenWithDrawCash <=", value, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashIn(List<BigDecimal> values) {
            addCriterion("frozenWithDrawCash in", values, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashNotIn(List<BigDecimal> values) {
            addCriterion("frozenWithDrawCash not in", values, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozenWithDrawCash between", value1, value2, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenwithdrawcashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozenWithDrawCash not between", value1, value2, "frozenwithdrawcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashIsNull() {
            addCriterion("frozenBiddingCash is null");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashIsNotNull() {
            addCriterion("frozenBiddingCash is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashEqualTo(BigDecimal value) {
            addCriterion("frozenBiddingCash =", value, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashNotEqualTo(BigDecimal value) {
            addCriterion("frozenBiddingCash <>", value, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashGreaterThan(BigDecimal value) {
            addCriterion("frozenBiddingCash >", value, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozenBiddingCash >=", value, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashLessThan(BigDecimal value) {
            addCriterion("frozenBiddingCash <", value, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozenBiddingCash <=", value, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashIn(List<BigDecimal> values) {
            addCriterion("frozenBiddingCash in", values, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashNotIn(List<BigDecimal> values) {
            addCriterion("frozenBiddingCash not in", values, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozenBiddingCash between", value1, value2, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andFrozenbiddingcashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozenBiddingCash not between", value1, value2, "frozenbiddingcash");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitIsNull() {
            addCriterion("idVerifyLimit is null");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitIsNotNull() {
            addCriterion("idVerifyLimit is not null");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitEqualTo(Short value) {
            addCriterion("idVerifyLimit =", value, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitNotEqualTo(Short value) {
            addCriterion("idVerifyLimit <>", value, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitGreaterThan(Short value) {
            addCriterion("idVerifyLimit >", value, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitGreaterThanOrEqualTo(Short value) {
            addCriterion("idVerifyLimit >=", value, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitLessThan(Short value) {
            addCriterion("idVerifyLimit <", value, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitLessThanOrEqualTo(Short value) {
            addCriterion("idVerifyLimit <=", value, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitIn(List<Short> values) {
            addCriterion("idVerifyLimit in", values, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitNotIn(List<Short> values) {
            addCriterion("idVerifyLimit not in", values, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitBetween(Short value1, Short value2) {
            addCriterion("idVerifyLimit between", value1, value2, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andIdverifylimitNotBetween(Short value1, Short value2) {
            addCriterion("idVerifyLimit not between", value1, value2, "idverifylimit");
            return (Criteria) this;
        }

        public Criteria andPortraitIsNull() {
            addCriterion("portrait is null");
            return (Criteria) this;
        }

        public Criteria andPortraitIsNotNull() {
            addCriterion("portrait is not null");
            return (Criteria) this;
        }

        public Criteria andPortraitEqualTo(Integer value) {
            addCriterion("portrait =", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotEqualTo(Integer value) {
            addCriterion("portrait <>", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitGreaterThan(Integer value) {
            addCriterion("portrait >", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitGreaterThanOrEqualTo(Integer value) {
            addCriterion("portrait >=", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLessThan(Integer value) {
            addCriterion("portrait <", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitLessThanOrEqualTo(Integer value) {
            addCriterion("portrait <=", value, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitIn(List<Integer> values) {
            addCriterion("portrait in", values, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotIn(List<Integer> values) {
            addCriterion("portrait not in", values, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitBetween(Integer value1, Integer value2) {
            addCriterion("portrait between", value1, value2, "portrait");
            return (Criteria) this;
        }

        public Criteria andPortraitNotBetween(Integer value1, Integer value2) {
            addCriterion("portrait not between", value1, value2, "portrait");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andForbidstatusIsNull() {
            addCriterion("forbidStatus is null");
            return (Criteria) this;
        }

        public Criteria andForbidstatusIsNotNull() {
            addCriterion("forbidStatus is not null");
            return (Criteria) this;
        }

        public Criteria andForbidstatusEqualTo(Short value) {
            addCriterion("forbidStatus =", value, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusNotEqualTo(Short value) {
            addCriterion("forbidStatus <>", value, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusGreaterThan(Short value) {
            addCriterion("forbidStatus >", value, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusGreaterThanOrEqualTo(Short value) {
            addCriterion("forbidStatus >=", value, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusLessThan(Short value) {
            addCriterion("forbidStatus <", value, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusLessThanOrEqualTo(Short value) {
            addCriterion("forbidStatus <=", value, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusIn(List<Short> values) {
            addCriterion("forbidStatus in", values, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusNotIn(List<Short> values) {
            addCriterion("forbidStatus not in", values, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusBetween(Short value1, Short value2) {
            addCriterion("forbidStatus between", value1, value2, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andForbidstatusNotBetween(Short value1, Short value2) {
            addCriterion("forbidStatus not between", value1, value2, "forbidstatus");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityIsNull() {
            addCriterion("albumCapacity is null");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityIsNotNull() {
            addCriterion("albumCapacity is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityEqualTo(Short value) {
            addCriterion("albumCapacity =", value, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityNotEqualTo(Short value) {
            addCriterion("albumCapacity <>", value, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityGreaterThan(Short value) {
            addCriterion("albumCapacity >", value, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityGreaterThanOrEqualTo(Short value) {
            addCriterion("albumCapacity >=", value, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityLessThan(Short value) {
            addCriterion("albumCapacity <", value, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityLessThanOrEqualTo(Short value) {
            addCriterion("albumCapacity <=", value, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityIn(List<Short> values) {
            addCriterion("albumCapacity in", values, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityNotIn(List<Short> values) {
            addCriterion("albumCapacity not in", values, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityBetween(Short value1, Short value2) {
            addCriterion("albumCapacity between", value1, value2, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andAlbumcapacityNotBetween(Short value1, Short value2) {
            addCriterion("albumCapacity not between", value1, value2, "albumcapacity");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelIsNull() {
            addCriterion("securityLevel is null");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelIsNotNull() {
            addCriterion("securityLevel is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelEqualTo(Short value) {
            addCriterion("securityLevel =", value, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelNotEqualTo(Short value) {
            addCriterion("securityLevel <>", value, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelGreaterThan(Short value) {
            addCriterion("securityLevel >", value, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelGreaterThanOrEqualTo(Short value) {
            addCriterion("securityLevel >=", value, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelLessThan(Short value) {
            addCriterion("securityLevel <", value, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelLessThanOrEqualTo(Short value) {
            addCriterion("securityLevel <=", value, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelIn(List<Short> values) {
            addCriterion("securityLevel in", values, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelNotIn(List<Short> values) {
            addCriterion("securityLevel not in", values, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelBetween(Short value1, Short value2) {
            addCriterion("securityLevel between", value1, value2, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andSecuritylevelNotBetween(Short value1, Short value2) {
            addCriterion("securityLevel not between", value1, value2, "securitylevel");
            return (Criteria) this;
        }

        public Criteria andWeibouidIsNull() {
            addCriterion("weiboUId is null");
            return (Criteria) this;
        }

        public Criteria andWeibouidIsNotNull() {
            addCriterion("weiboUId is not null");
            return (Criteria) this;
        }

        public Criteria andWeibouidEqualTo(String value) {
            addCriterion("weiboUId =", value, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidNotEqualTo(String value) {
            addCriterion("weiboUId <>", value, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidGreaterThan(String value) {
            addCriterion("weiboUId >", value, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidGreaterThanOrEqualTo(String value) {
            addCriterion("weiboUId >=", value, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidLessThan(String value) {
            addCriterion("weiboUId <", value, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidLessThanOrEqualTo(String value) {
            addCriterion("weiboUId <=", value, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidLike(String value) {
            addCriterion("weiboUId like", value, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidNotLike(String value) {
            addCriterion("weiboUId not like", value, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidIn(List<String> values) {
            addCriterion("weiboUId in", values, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidNotIn(List<String> values) {
            addCriterion("weiboUId not in", values, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidBetween(String value1, String value2) {
            addCriterion("weiboUId between", value1, value2, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeibouidNotBetween(String value1, String value2) {
            addCriterion("weiboUId not between", value1, value2, "weibouid");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenIsNull() {
            addCriterion("weiboAccessToken is null");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenIsNotNull() {
            addCriterion("weiboAccessToken is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenEqualTo(String value) {
            addCriterion("weiboAccessToken =", value, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenNotEqualTo(String value) {
            addCriterion("weiboAccessToken <>", value, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenGreaterThan(String value) {
            addCriterion("weiboAccessToken >", value, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenGreaterThanOrEqualTo(String value) {
            addCriterion("weiboAccessToken >=", value, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenLessThan(String value) {
            addCriterion("weiboAccessToken <", value, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenLessThanOrEqualTo(String value) {
            addCriterion("weiboAccessToken <=", value, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenLike(String value) {
            addCriterion("weiboAccessToken like", value, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenNotLike(String value) {
            addCriterion("weiboAccessToken not like", value, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenIn(List<String> values) {
            addCriterion("weiboAccessToken in", values, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenNotIn(List<String> values) {
            addCriterion("weiboAccessToken not in", values, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenBetween(String value1, String value2) {
            addCriterion("weiboAccessToken between", value1, value2, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andWeiboaccesstokenNotBetween(String value1, String value2) {
            addCriterion("weiboAccessToken not between", value1, value2, "weiboaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQquidIsNull() {
            addCriterion("qqUId is null");
            return (Criteria) this;
        }

        public Criteria andQquidIsNotNull() {
            addCriterion("qqUId is not null");
            return (Criteria) this;
        }

        public Criteria andQquidEqualTo(String value) {
            addCriterion("qqUId =", value, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidNotEqualTo(String value) {
            addCriterion("qqUId <>", value, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidGreaterThan(String value) {
            addCriterion("qqUId >", value, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidGreaterThanOrEqualTo(String value) {
            addCriterion("qqUId >=", value, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidLessThan(String value) {
            addCriterion("qqUId <", value, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidLessThanOrEqualTo(String value) {
            addCriterion("qqUId <=", value, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidLike(String value) {
            addCriterion("qqUId like", value, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidNotLike(String value) {
            addCriterion("qqUId not like", value, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidIn(List<String> values) {
            addCriterion("qqUId in", values, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidNotIn(List<String> values) {
            addCriterion("qqUId not in", values, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidBetween(String value1, String value2) {
            addCriterion("qqUId between", value1, value2, "qquid");
            return (Criteria) this;
        }

        public Criteria andQquidNotBetween(String value1, String value2) {
            addCriterion("qqUId not between", value1, value2, "qquid");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenIsNull() {
            addCriterion("qqAccessToken is null");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenIsNotNull() {
            addCriterion("qqAccessToken is not null");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenEqualTo(String value) {
            addCriterion("qqAccessToken =", value, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenNotEqualTo(String value) {
            addCriterion("qqAccessToken <>", value, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenGreaterThan(String value) {
            addCriterion("qqAccessToken >", value, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenGreaterThanOrEqualTo(String value) {
            addCriterion("qqAccessToken >=", value, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenLessThan(String value) {
            addCriterion("qqAccessToken <", value, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenLessThanOrEqualTo(String value) {
            addCriterion("qqAccessToken <=", value, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenLike(String value) {
            addCriterion("qqAccessToken like", value, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenNotLike(String value) {
            addCriterion("qqAccessToken not like", value, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenIn(List<String> values) {
            addCriterion("qqAccessToken in", values, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenNotIn(List<String> values) {
            addCriterion("qqAccessToken not in", values, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenBetween(String value1, String value2) {
            addCriterion("qqAccessToken between", value1, value2, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andQqaccesstokenNotBetween(String value1, String value2) {
            addCriterion("qqAccessToken not between", value1, value2, "qqaccesstoken");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(Short value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(Short value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(Short value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(Short value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(Short value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(Short value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<Short> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<Short> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(Short value1, Short value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(Short value1, Short value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(Integer value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(Integer value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(Integer value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(Integer value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(Integer value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<Integer> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<Integer> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(Integer value1, Integer value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("userCode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("userCode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("userCode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("userCode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("userCode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("userCode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("userCode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("userCode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("userCode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("userCode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("userCode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("userCode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("userCode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("userCode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andRefereeIsNull() {
            addCriterion("referee is null");
            return (Criteria) this;
        }

        public Criteria andRefereeIsNotNull() {
            addCriterion("referee is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeEqualTo(String value) {
            addCriterion("referee =", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotEqualTo(String value) {
            addCriterion("referee <>", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeGreaterThan(String value) {
            addCriterion("referee >", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeGreaterThanOrEqualTo(String value) {
            addCriterion("referee >=", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLessThan(String value) {
            addCriterion("referee <", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLessThanOrEqualTo(String value) {
            addCriterion("referee <=", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeLike(String value) {
            addCriterion("referee like", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotLike(String value) {
            addCriterion("referee not like", value, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeIn(List<String> values) {
            addCriterion("referee in", values, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotIn(List<String> values) {
            addCriterion("referee not in", values, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeBetween(String value1, String value2) {
            addCriterion("referee between", value1, value2, "referee");
            return (Criteria) this;
        }

        public Criteria andRefereeNotBetween(String value1, String value2) {
            addCriterion("referee not between", value1, value2, "referee");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeIsNull() {
            addCriterion("level_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeIsNotNull() {
            addCriterion("level_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeEqualTo(Date value) {
            addCriterion("level_update_time =", value, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeNotEqualTo(Date value) {
            addCriterion("level_update_time <>", value, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeGreaterThan(Date value) {
            addCriterion("level_update_time >", value, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("level_update_time >=", value, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeLessThan(Date value) {
            addCriterion("level_update_time <", value, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("level_update_time <=", value, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeIn(List<Date> values) {
            addCriterion("level_update_time in", values, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeNotIn(List<Date> values) {
            addCriterion("level_update_time not in", values, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("level_update_time between", value1, value2, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("level_update_time not between", value1, value2, "levelUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andBindtimeIsNull() {
            addCriterion("bindtime is null");
            return (Criteria) this;
        }

        public Criteria andBindtimeIsNotNull() {
            addCriterion("bindtime is not null");
            return (Criteria) this;
        }

        public Criteria andBindtimeEqualTo(Date value) {
            addCriterion("bindtime =", value, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeNotEqualTo(Date value) {
            addCriterion("bindtime <>", value, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeGreaterThan(Date value) {
            addCriterion("bindtime >", value, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bindtime >=", value, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeLessThan(Date value) {
            addCriterion("bindtime <", value, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeLessThanOrEqualTo(Date value) {
            addCriterion("bindtime <=", value, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeIn(List<Date> values) {
            addCriterion("bindtime in", values, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeNotIn(List<Date> values) {
            addCriterion("bindtime not in", values, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeBetween(Date value1, Date value2) {
            addCriterion("bindtime between", value1, value2, "bindtime");
            return (Criteria) this;
        }

        public Criteria andBindtimeNotBetween(Date value1, Date value2) {
            addCriterion("bindtime not between", value1, value2, "bindtime");
            return (Criteria) this;
        }

        public Criteria andLoginkeyIsNull() {
            addCriterion("loginkey is null");
            return (Criteria) this;
        }

        public Criteria andLoginkeyIsNotNull() {
            addCriterion("loginkey is not null");
            return (Criteria) this;
        }

        public Criteria andLoginkeyEqualTo(String value) {
            addCriterion("loginkey =", value, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyNotEqualTo(String value) {
            addCriterion("loginkey <>", value, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyGreaterThan(String value) {
            addCriterion("loginkey >", value, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyGreaterThanOrEqualTo(String value) {
            addCriterion("loginkey >=", value, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyLessThan(String value) {
            addCriterion("loginkey <", value, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyLessThanOrEqualTo(String value) {
            addCriterion("loginkey <=", value, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyLike(String value) {
            addCriterion("loginkey like", value, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyNotLike(String value) {
            addCriterion("loginkey not like", value, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyIn(List<String> values) {
            addCriterion("loginkey in", values, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyNotIn(List<String> values) {
            addCriterion("loginkey not in", values, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyBetween(String value1, String value2) {
            addCriterion("loginkey between", value1, value2, "loginkey");
            return (Criteria) this;
        }

        public Criteria andLoginkeyNotBetween(String value1, String value2) {
            addCriterion("loginkey not between", value1, value2, "loginkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyIsNull() {
            addCriterion("userkey is null");
            return (Criteria) this;
        }

        public Criteria andUserkeyIsNotNull() {
            addCriterion("userkey is not null");
            return (Criteria) this;
        }

        public Criteria andUserkeyEqualTo(String value) {
            addCriterion("userkey =", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotEqualTo(String value) {
            addCriterion("userkey <>", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThan(String value) {
            addCriterion("userkey >", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThanOrEqualTo(String value) {
            addCriterion("userkey >=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThan(String value) {
            addCriterion("userkey <", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThanOrEqualTo(String value) {
            addCriterion("userkey <=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLike(String value) {
            addCriterion("userkey like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotLike(String value) {
            addCriterion("userkey not like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyIn(List<String> values) {
            addCriterion("userkey in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotIn(List<String> values) {
            addCriterion("userkey not in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyBetween(String value1, String value2) {
            addCriterion("userkey between", value1, value2, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotBetween(String value1, String value2) {
            addCriterion("userkey not between", value1, value2, "userkey");
            return (Criteria) this;
        }

        public Criteria andCashchlIsNull() {
            addCriterion("cashChl is null");
            return (Criteria) this;
        }

        public Criteria andCashchlIsNotNull() {
            addCriterion("cashChl is not null");
            return (Criteria) this;
        }

        public Criteria andCashchlEqualTo(String value) {
            addCriterion("cashChl =", value, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlNotEqualTo(String value) {
            addCriterion("cashChl <>", value, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlGreaterThan(String value) {
            addCriterion("cashChl >", value, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlGreaterThanOrEqualTo(String value) {
            addCriterion("cashChl >=", value, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlLessThan(String value) {
            addCriterion("cashChl <", value, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlLessThanOrEqualTo(String value) {
            addCriterion("cashChl <=", value, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlLike(String value) {
            addCriterion("cashChl like", value, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlNotLike(String value) {
            addCriterion("cashChl not like", value, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlIn(List<String> values) {
            addCriterion("cashChl in", values, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlNotIn(List<String> values) {
            addCriterion("cashChl not in", values, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlBetween(String value1, String value2) {
            addCriterion("cashChl between", value1, value2, "cashchl");
            return (Criteria) this;
        }

        public Criteria andCashchlNotBetween(String value1, String value2) {
            addCriterion("cashChl not between", value1, value2, "cashchl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}