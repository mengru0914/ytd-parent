package com.ytd.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserInvestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInvestExample() {
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
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Byte value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Byte value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Byte value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Byte value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Byte value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Byte value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Byte> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Byte> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Byte value1, Byte value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Byte value1, Byte value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(Byte value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(Byte value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(Byte value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(Byte value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(Byte value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(Byte value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<Byte> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<Byte> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(Byte value1, Byte value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(Byte value1, Byte value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(Byte value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(Byte value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(Byte value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(Byte value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(Byte value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(Byte value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<Byte> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<Byte> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(Byte value1, Byte value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(Byte value1, Byte value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andInvesttimeIsNull() {
            addCriterion("investTime is null");
            return (Criteria) this;
        }

        public Criteria andInvesttimeIsNotNull() {
            addCriterion("investTime is not null");
            return (Criteria) this;
        }

        public Criteria andInvesttimeEqualTo(Byte value) {
            addCriterion("investTime =", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeNotEqualTo(Byte value) {
            addCriterion("investTime <>", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeGreaterThan(Byte value) {
            addCriterion("investTime >", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("investTime >=", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeLessThan(Byte value) {
            addCriterion("investTime <", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeLessThanOrEqualTo(Byte value) {
            addCriterion("investTime <=", value, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeIn(List<Byte> values) {
            addCriterion("investTime in", values, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeNotIn(List<Byte> values) {
            addCriterion("investTime not in", values, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeBetween(Byte value1, Byte value2) {
            addCriterion("investTime between", value1, value2, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvesttimeNotBetween(Byte value1, Byte value2) {
            addCriterion("investTime not between", value1, value2, "investtime");
            return (Criteria) this;
        }

        public Criteria andInvestamountIsNull() {
            addCriterion("investAmount is null");
            return (Criteria) this;
        }

        public Criteria andInvestamountIsNotNull() {
            addCriterion("investAmount is not null");
            return (Criteria) this;
        }

        public Criteria andInvestamountEqualTo(Byte value) {
            addCriterion("investAmount =", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountNotEqualTo(Byte value) {
            addCriterion("investAmount <>", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountGreaterThan(Byte value) {
            addCriterion("investAmount >", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountGreaterThanOrEqualTo(Byte value) {
            addCriterion("investAmount >=", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountLessThan(Byte value) {
            addCriterion("investAmount <", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountLessThanOrEqualTo(Byte value) {
            addCriterion("investAmount <=", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountIn(List<Byte> values) {
            addCriterion("investAmount in", values, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountNotIn(List<Byte> values) {
            addCriterion("investAmount not in", values, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountBetween(Byte value1, Byte value2) {
            addCriterion("investAmount between", value1, value2, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountNotBetween(Byte value1, Byte value2) {
            addCriterion("investAmount not between", value1, value2, "investamount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountIsNull() {
            addCriterion("leftTermCount is null");
            return (Criteria) this;
        }

        public Criteria andLefttermcountIsNotNull() {
            addCriterion("leftTermCount is not null");
            return (Criteria) this;
        }

        public Criteria andLefttermcountEqualTo(Byte value) {
            addCriterion("leftTermCount =", value, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountNotEqualTo(Byte value) {
            addCriterion("leftTermCount <>", value, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountGreaterThan(Byte value) {
            addCriterion("leftTermCount >", value, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountGreaterThanOrEqualTo(Byte value) {
            addCriterion("leftTermCount >=", value, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountLessThan(Byte value) {
            addCriterion("leftTermCount <", value, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountLessThanOrEqualTo(Byte value) {
            addCriterion("leftTermCount <=", value, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountIn(List<Byte> values) {
            addCriterion("leftTermCount in", values, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountNotIn(List<Byte> values) {
            addCriterion("leftTermCount not in", values, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountBetween(Byte value1, Byte value2) {
            addCriterion("leftTermCount between", value1, value2, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andLefttermcountNotBetween(Byte value1, Byte value2) {
            addCriterion("leftTermCount not between", value1, value2, "lefttermcount");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIsNull() {
            addCriterion("nextRepayDate is null");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIsNotNull() {
            addCriterion("nextRepayDate is not null");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateEqualTo(Byte value) {
            addCriterion("nextRepayDate =", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotEqualTo(Byte value) {
            addCriterion("nextRepayDate <>", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateGreaterThan(Byte value) {
            addCriterion("nextRepayDate >", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateGreaterThanOrEqualTo(Byte value) {
            addCriterion("nextRepayDate >=", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateLessThan(Byte value) {
            addCriterion("nextRepayDate <", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateLessThanOrEqualTo(Byte value) {
            addCriterion("nextRepayDate <=", value, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateIn(List<Byte> values) {
            addCriterion("nextRepayDate in", values, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotIn(List<Byte> values) {
            addCriterion("nextRepayDate not in", values, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateBetween(Byte value1, Byte value2) {
            addCriterion("nextRepayDate between", value1, value2, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andNextrepaydateNotBetween(Byte value1, Byte value2) {
            addCriterion("nextRepayDate not between", value1, value2, "nextrepaydate");
            return (Criteria) this;
        }

        public Criteria andLoanidIsNull() {
            addCriterion("loanId is null");
            return (Criteria) this;
        }

        public Criteria andLoanidIsNotNull() {
            addCriterion("loanId is not null");
            return (Criteria) this;
        }

        public Criteria andLoanidEqualTo(Byte value) {
            addCriterion("loanId =", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotEqualTo(Byte value) {
            addCriterion("loanId <>", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidGreaterThan(Byte value) {
            addCriterion("loanId >", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidGreaterThanOrEqualTo(Byte value) {
            addCriterion("loanId >=", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidLessThan(Byte value) {
            addCriterion("loanId <", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidLessThanOrEqualTo(Byte value) {
            addCriterion("loanId <=", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidIn(List<Byte> values) {
            addCriterion("loanId in", values, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotIn(List<Byte> values) {
            addCriterion("loanId not in", values, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidBetween(Byte value1, Byte value2) {
            addCriterion("loanId between", value1, value2, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotBetween(Byte value1, Byte value2) {
            addCriterion("loanId not between", value1, value2, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIsNull() {
            addCriterion("loan_title is null");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIsNotNull() {
            addCriterion("loan_title is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTitleEqualTo(Byte value) {
            addCriterion("loan_title =", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotEqualTo(Byte value) {
            addCriterion("loan_title <>", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleGreaterThan(Byte value) {
            addCriterion("loan_title >", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleGreaterThanOrEqualTo(Byte value) {
            addCriterion("loan_title >=", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleLessThan(Byte value) {
            addCriterion("loan_title <", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleLessThanOrEqualTo(Byte value) {
            addCriterion("loan_title <=", value, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleIn(List<Byte> values) {
            addCriterion("loan_title in", values, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotIn(List<Byte> values) {
            addCriterion("loan_title not in", values, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleBetween(Byte value1, Byte value2) {
            addCriterion("loan_title between", value1, value2, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andLoanTitleNotBetween(Byte value1, Byte value2) {
            addCriterion("loan_title not between", value1, value2, "loanTitle");
            return (Criteria) this;
        }

        public Criteria andDaibenIsNull() {
            addCriterion("daiben is null");
            return (Criteria) this;
        }

        public Criteria andDaibenIsNotNull() {
            addCriterion("daiben is not null");
            return (Criteria) this;
        }

        public Criteria andDaibenEqualTo(Byte value) {
            addCriterion("daiben =", value, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenNotEqualTo(Byte value) {
            addCriterion("daiben <>", value, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenGreaterThan(Byte value) {
            addCriterion("daiben >", value, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenGreaterThanOrEqualTo(Byte value) {
            addCriterion("daiben >=", value, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenLessThan(Byte value) {
            addCriterion("daiben <", value, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenLessThanOrEqualTo(Byte value) {
            addCriterion("daiben <=", value, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenIn(List<Byte> values) {
            addCriterion("daiben in", values, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenNotIn(List<Byte> values) {
            addCriterion("daiben not in", values, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenBetween(Byte value1, Byte value2) {
            addCriterion("daiben between", value1, value2, "daiben");
            return (Criteria) this;
        }

        public Criteria andDaibenNotBetween(Byte value1, Byte value2) {
            addCriterion("daiben not between", value1, value2, "daiben");
            return (Criteria) this;
        }

        public Criteria andDailiIsNull() {
            addCriterion("daili is null");
            return (Criteria) this;
        }

        public Criteria andDailiIsNotNull() {
            addCriterion("daili is not null");
            return (Criteria) this;
        }

        public Criteria andDailiEqualTo(Byte value) {
            addCriterion("daili =", value, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiNotEqualTo(Byte value) {
            addCriterion("daili <>", value, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiGreaterThan(Byte value) {
            addCriterion("daili >", value, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiGreaterThanOrEqualTo(Byte value) {
            addCriterion("daili >=", value, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiLessThan(Byte value) {
            addCriterion("daili <", value, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiLessThanOrEqualTo(Byte value) {
            addCriterion("daili <=", value, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiIn(List<Byte> values) {
            addCriterion("daili in", values, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiNotIn(List<Byte> values) {
            addCriterion("daili not in", values, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiBetween(Byte value1, Byte value2) {
            addCriterion("daili between", value1, value2, "daili");
            return (Criteria) this;
        }

        public Criteria andDailiNotBetween(Byte value1, Byte value2) {
            addCriterion("daili not between", value1, value2, "daili");
            return (Criteria) this;
        }

        public Criteria andBstatusIsNull() {
            addCriterion("bstatus is null");
            return (Criteria) this;
        }

        public Criteria andBstatusIsNotNull() {
            addCriterion("bstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBstatusEqualTo(Byte value) {
            addCriterion("bstatus =", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotEqualTo(Byte value) {
            addCriterion("bstatus <>", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusGreaterThan(Byte value) {
            addCriterion("bstatus >", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("bstatus >=", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLessThan(Byte value) {
            addCriterion("bstatus <", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusLessThanOrEqualTo(Byte value) {
            addCriterion("bstatus <=", value, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusIn(List<Byte> values) {
            addCriterion("bstatus in", values, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotIn(List<Byte> values) {
            addCriterion("bstatus not in", values, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusBetween(Byte value1, Byte value2) {
            addCriterion("bstatus between", value1, value2, "bstatus");
            return (Criteria) this;
        }

        public Criteria andBstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("bstatus not between", value1, value2, "bstatus");
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