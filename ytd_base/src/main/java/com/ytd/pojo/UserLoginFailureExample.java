package com.ytd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginFailureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLoginFailureExample() {
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

        public Criteria andAttempttimesIsNull() {
            addCriterion("attemptTimes is null");
            return (Criteria) this;
        }

        public Criteria andAttempttimesIsNotNull() {
            addCriterion("attemptTimes is not null");
            return (Criteria) this;
        }

        public Criteria andAttempttimesEqualTo(Integer value) {
            addCriterion("attemptTimes =", value, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesNotEqualTo(Integer value) {
            addCriterion("attemptTimes <>", value, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesGreaterThan(Integer value) {
            addCriterion("attemptTimes >", value, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("attemptTimes >=", value, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesLessThan(Integer value) {
            addCriterion("attemptTimes <", value, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesLessThanOrEqualTo(Integer value) {
            addCriterion("attemptTimes <=", value, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesIn(List<Integer> values) {
            addCriterion("attemptTimes in", values, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesNotIn(List<Integer> values) {
            addCriterion("attemptTimes not in", values, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesBetween(Integer value1, Integer value2) {
            addCriterion("attemptTimes between", value1, value2, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andAttempttimesNotBetween(Integer value1, Integer value2) {
            addCriterion("attemptTimes not between", value1, value2, "attempttimes");
            return (Criteria) this;
        }

        public Criteria andLastattempedIsNull() {
            addCriterion("lastAttemped is null");
            return (Criteria) this;
        }

        public Criteria andLastattempedIsNotNull() {
            addCriterion("lastAttemped is not null");
            return (Criteria) this;
        }

        public Criteria andLastattempedEqualTo(Date value) {
            addCriterion("lastAttemped =", value, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedNotEqualTo(Date value) {
            addCriterion("lastAttemped <>", value, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedGreaterThan(Date value) {
            addCriterion("lastAttemped >", value, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedGreaterThanOrEqualTo(Date value) {
            addCriterion("lastAttemped >=", value, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedLessThan(Date value) {
            addCriterion("lastAttemped <", value, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedLessThanOrEqualTo(Date value) {
            addCriterion("lastAttemped <=", value, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedIn(List<Date> values) {
            addCriterion("lastAttemped in", values, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedNotIn(List<Date> values) {
            addCriterion("lastAttemped not in", values, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedBetween(Date value1, Date value2) {
            addCriterion("lastAttemped between", value1, value2, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastattempedNotBetween(Date value1, Date value2) {
            addCriterion("lastAttemped not between", value1, value2, "lastattemped");
            return (Criteria) this;
        }

        public Criteria andLastlockedIsNull() {
            addCriterion("lastLocked is null");
            return (Criteria) this;
        }

        public Criteria andLastlockedIsNotNull() {
            addCriterion("lastLocked is not null");
            return (Criteria) this;
        }

        public Criteria andLastlockedEqualTo(Date value) {
            addCriterion("lastLocked =", value, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedNotEqualTo(Date value) {
            addCriterion("lastLocked <>", value, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedGreaterThan(Date value) {
            addCriterion("lastLocked >", value, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLocked >=", value, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedLessThan(Date value) {
            addCriterion("lastLocked <", value, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedLessThanOrEqualTo(Date value) {
            addCriterion("lastLocked <=", value, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedIn(List<Date> values) {
            addCriterion("lastLocked in", values, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedNotIn(List<Date> values) {
            addCriterion("lastLocked not in", values, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedBetween(Date value1, Date value2) {
            addCriterion("lastLocked between", value1, value2, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastlockedNotBetween(Date value1, Date value2) {
            addCriterion("lastLocked not between", value1, value2, "lastlocked");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNull() {
            addCriterion("lastLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNotNull() {
            addCriterion("lastLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginipEqualTo(Integer value) {
            addCriterion("lastLoginIP =", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotEqualTo(Integer value) {
            addCriterion("lastLoginIP <>", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThan(Integer value) {
            addCriterion("lastLoginIP >", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastLoginIP >=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThan(Integer value) {
            addCriterion("lastLoginIP <", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThanOrEqualTo(Integer value) {
            addCriterion("lastLoginIP <=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIn(List<Integer> values) {
            addCriterion("lastLoginIP in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotIn(List<Integer> values) {
            addCriterion("lastLoginIP not in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipBetween(Integer value1, Integer value2) {
            addCriterion("lastLoginIP between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotBetween(Integer value1, Integer value2) {
            addCriterion("lastLoginIP not between", value1, value2, "lastloginip");
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