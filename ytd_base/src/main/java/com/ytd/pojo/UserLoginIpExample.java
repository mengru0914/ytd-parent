package com.ytd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginIpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLoginIpExample() {
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

        public Criteria andIpidIsNull() {
            addCriterion("ipId is null");
            return (Criteria) this;
        }

        public Criteria andIpidIsNotNull() {
            addCriterion("ipId is not null");
            return (Criteria) this;
        }

        public Criteria andIpidEqualTo(Integer value) {
            addCriterion("ipId =", value, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidNotEqualTo(Integer value) {
            addCriterion("ipId <>", value, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidGreaterThan(Integer value) {
            addCriterion("ipId >", value, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ipId >=", value, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidLessThan(Integer value) {
            addCriterion("ipId <", value, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidLessThanOrEqualTo(Integer value) {
            addCriterion("ipId <=", value, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidIn(List<Integer> values) {
            addCriterion("ipId in", values, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidNotIn(List<Integer> values) {
            addCriterion("ipId not in", values, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidBetween(Integer value1, Integer value2) {
            addCriterion("ipId between", value1, value2, "ipid");
            return (Criteria) this;
        }

        public Criteria andIpidNotBetween(Integer value1, Integer value2) {
            addCriterion("ipId not between", value1, value2, "ipid");
            return (Criteria) this;
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

        public Criteria andLoginipIsNull() {
            addCriterion("loginIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(Integer value) {
            addCriterion("loginIP =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(Integer value) {
            addCriterion("loginIP <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(Integer value) {
            addCriterion("loginIP >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginIP >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(Integer value) {
            addCriterion("loginIP <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(Integer value) {
            addCriterion("loginIP <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<Integer> values) {
            addCriterion("loginIP in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<Integer> values) {
            addCriterion("loginIP not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(Integer value1, Integer value2) {
            addCriterion("loginIP between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(Integer value1, Integer value2) {
            addCriterion("loginIP not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeIsNull() {
            addCriterion("browserType is null");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeIsNotNull() {
            addCriterion("browserType is not null");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeEqualTo(Short value) {
            addCriterion("browserType =", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeNotEqualTo(Short value) {
            addCriterion("browserType <>", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeGreaterThan(Short value) {
            addCriterion("browserType >", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("browserType >=", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeLessThan(Short value) {
            addCriterion("browserType <", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeLessThanOrEqualTo(Short value) {
            addCriterion("browserType <=", value, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeIn(List<Short> values) {
            addCriterion("browserType in", values, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeNotIn(List<Short> values) {
            addCriterion("browserType not in", values, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeBetween(Short value1, Short value2) {
            addCriterion("browserType between", value1, value2, "browsertype");
            return (Criteria) this;
        }

        public Criteria andBrowsertypeNotBetween(Short value1, Short value2) {
            addCriterion("browserType not between", value1, value2, "browsertype");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNull() {
            addCriterion("osType is null");
            return (Criteria) this;
        }

        public Criteria andOstypeIsNotNull() {
            addCriterion("osType is not null");
            return (Criteria) this;
        }

        public Criteria andOstypeEqualTo(Short value) {
            addCriterion("osType =", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotEqualTo(Short value) {
            addCriterion("osType <>", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThan(Short value) {
            addCriterion("osType >", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeGreaterThanOrEqualTo(Short value) {
            addCriterion("osType >=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThan(Short value) {
            addCriterion("osType <", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeLessThanOrEqualTo(Short value) {
            addCriterion("osType <=", value, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeIn(List<Short> values) {
            addCriterion("osType in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotIn(List<Short> values) {
            addCriterion("osType not in", values, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeBetween(Short value1, Short value2) {
            addCriterion("osType between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andOstypeNotBetween(Short value1, Short value2) {
            addCriterion("osType not between", value1, value2, "ostype");
            return (Criteria) this;
        }

        public Criteria andLoginaddressIsNull() {
            addCriterion("loginAddress is null");
            return (Criteria) this;
        }

        public Criteria andLoginaddressIsNotNull() {
            addCriterion("loginAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLoginaddressEqualTo(String value) {
            addCriterion("loginAddress =", value, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressNotEqualTo(String value) {
            addCriterion("loginAddress <>", value, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressGreaterThan(String value) {
            addCriterion("loginAddress >", value, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressGreaterThanOrEqualTo(String value) {
            addCriterion("loginAddress >=", value, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressLessThan(String value) {
            addCriterion("loginAddress <", value, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressLessThanOrEqualTo(String value) {
            addCriterion("loginAddress <=", value, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressLike(String value) {
            addCriterion("loginAddress like", value, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressNotLike(String value) {
            addCriterion("loginAddress not like", value, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressIn(List<String> values) {
            addCriterion("loginAddress in", values, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressNotIn(List<String> values) {
            addCriterion("loginAddress not in", values, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressBetween(String value1, String value2) {
            addCriterion("loginAddress between", value1, value2, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLoginaddressNotBetween(String value1, String value2) {
            addCriterion("loginAddress not between", value1, value2, "loginaddress");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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