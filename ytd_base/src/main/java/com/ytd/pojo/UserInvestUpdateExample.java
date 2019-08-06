package com.ytd.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserInvestUpdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInvestUpdateExample() {
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

        public Criteria andInvestoruseridIsNull() {
            addCriterion("investorUserId is null");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridIsNotNull() {
            addCriterion("investorUserId is not null");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridEqualTo(Byte value) {
            addCriterion("investorUserId =", value, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridNotEqualTo(Byte value) {
            addCriterion("investorUserId <>", value, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridGreaterThan(Byte value) {
            addCriterion("investorUserId >", value, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridGreaterThanOrEqualTo(Byte value) {
            addCriterion("investorUserId >=", value, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridLessThan(Byte value) {
            addCriterion("investorUserId <", value, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridLessThanOrEqualTo(Byte value) {
            addCriterion("investorUserId <=", value, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridIn(List<Byte> values) {
            addCriterion("investorUserId in", values, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridNotIn(List<Byte> values) {
            addCriterion("investorUserId not in", values, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridBetween(Byte value1, Byte value2) {
            addCriterion("investorUserId between", value1, value2, "investoruserid");
            return (Criteria) this;
        }

        public Criteria andInvestoruseridNotBetween(Byte value1, Byte value2) {
            addCriterion("investorUserId not between", value1, value2, "investoruserid");
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