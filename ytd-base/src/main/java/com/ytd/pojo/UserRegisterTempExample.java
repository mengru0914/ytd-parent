package com.ytd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRegisterTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRegisterTempExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
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