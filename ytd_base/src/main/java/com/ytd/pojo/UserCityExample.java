package com.ytd.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserCityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCityExample() {
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

        public Criteria andResidenceprovinceIsNull() {
            addCriterion("residenceProvince is null");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceIsNotNull() {
            addCriterion("residenceProvince is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceEqualTo(String value) {
            addCriterion("residenceProvince =", value, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceNotEqualTo(String value) {
            addCriterion("residenceProvince <>", value, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceGreaterThan(String value) {
            addCriterion("residenceProvince >", value, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("residenceProvince >=", value, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceLessThan(String value) {
            addCriterion("residenceProvince <", value, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceLessThanOrEqualTo(String value) {
            addCriterion("residenceProvince <=", value, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceLike(String value) {
            addCriterion("residenceProvince like", value, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceNotLike(String value) {
            addCriterion("residenceProvince not like", value, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceIn(List<String> values) {
            addCriterion("residenceProvince in", values, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceNotIn(List<String> values) {
            addCriterion("residenceProvince not in", values, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceBetween(String value1, String value2) {
            addCriterion("residenceProvince between", value1, value2, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidenceprovinceNotBetween(String value1, String value2) {
            addCriterion("residenceProvince not between", value1, value2, "residenceprovince");
            return (Criteria) this;
        }

        public Criteria andResidencecityIsNull() {
            addCriterion("residenceCity is null");
            return (Criteria) this;
        }

        public Criteria andResidencecityIsNotNull() {
            addCriterion("residenceCity is not null");
            return (Criteria) this;
        }

        public Criteria andResidencecityEqualTo(String value) {
            addCriterion("residenceCity =", value, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityNotEqualTo(String value) {
            addCriterion("residenceCity <>", value, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityGreaterThan(String value) {
            addCriterion("residenceCity >", value, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityGreaterThanOrEqualTo(String value) {
            addCriterion("residenceCity >=", value, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityLessThan(String value) {
            addCriterion("residenceCity <", value, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityLessThanOrEqualTo(String value) {
            addCriterion("residenceCity <=", value, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityLike(String value) {
            addCriterion("residenceCity like", value, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityNotLike(String value) {
            addCriterion("residenceCity not like", value, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityIn(List<String> values) {
            addCriterion("residenceCity in", values, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityNotIn(List<String> values) {
            addCriterion("residenceCity not in", values, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityBetween(String value1, String value2) {
            addCriterion("residenceCity between", value1, value2, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecityNotBetween(String value1, String value2) {
            addCriterion("residenceCity not between", value1, value2, "residencecity");
            return (Criteria) this;
        }

        public Criteria andResidencecountyIsNull() {
            addCriterion("residenceCounty is null");
            return (Criteria) this;
        }

        public Criteria andResidencecountyIsNotNull() {
            addCriterion("residenceCounty is not null");
            return (Criteria) this;
        }

        public Criteria andResidencecountyEqualTo(String value) {
            addCriterion("residenceCounty =", value, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyNotEqualTo(String value) {
            addCriterion("residenceCounty <>", value, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyGreaterThan(String value) {
            addCriterion("residenceCounty >", value, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyGreaterThanOrEqualTo(String value) {
            addCriterion("residenceCounty >=", value, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyLessThan(String value) {
            addCriterion("residenceCounty <", value, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyLessThanOrEqualTo(String value) {
            addCriterion("residenceCounty <=", value, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyLike(String value) {
            addCriterion("residenceCounty like", value, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyNotLike(String value) {
            addCriterion("residenceCounty not like", value, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyIn(List<String> values) {
            addCriterion("residenceCounty in", values, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyNotIn(List<String> values) {
            addCriterion("residenceCounty not in", values, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyBetween(String value1, String value2) {
            addCriterion("residenceCounty between", value1, value2, "residencecounty");
            return (Criteria) this;
        }

        public Criteria andResidencecountyNotBetween(String value1, String value2) {
            addCriterion("residenceCounty not between", value1, value2, "residencecounty");
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