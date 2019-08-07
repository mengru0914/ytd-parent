package com.ytd.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserEduInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserEduInfoExample() {
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

        public Criteria andUsereduinfoidIsNull() {
            addCriterion("userEduInfoId is null");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidIsNotNull() {
            addCriterion("userEduInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidEqualTo(Integer value) {
            addCriterion("userEduInfoId =", value, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidNotEqualTo(Integer value) {
            addCriterion("userEduInfoId <>", value, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidGreaterThan(Integer value) {
            addCriterion("userEduInfoId >", value, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userEduInfoId >=", value, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidLessThan(Integer value) {
            addCriterion("userEduInfoId <", value, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("userEduInfoId <=", value, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidIn(List<Integer> values) {
            addCriterion("userEduInfoId in", values, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidNotIn(List<Integer> values) {
            addCriterion("userEduInfoId not in", values, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidBetween(Integer value1, Integer value2) {
            addCriterion("userEduInfoId between", value1, value2, "usereduinfoid");
            return (Criteria) this;
        }

        public Criteria andUsereduinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("userEduInfoId not between", value1, value2, "usereduinfoid");
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

        public Criteria andStartyearIsNull() {
            addCriterion("startYear is null");
            return (Criteria) this;
        }

        public Criteria andStartyearIsNotNull() {
            addCriterion("startYear is not null");
            return (Criteria) this;
        }

        public Criteria andStartyearEqualTo(Short value) {
            addCriterion("startYear =", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotEqualTo(Short value) {
            addCriterion("startYear <>", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearGreaterThan(Short value) {
            addCriterion("startYear >", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearGreaterThanOrEqualTo(Short value) {
            addCriterion("startYear >=", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearLessThan(Short value) {
            addCriterion("startYear <", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearLessThanOrEqualTo(Short value) {
            addCriterion("startYear <=", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearIn(List<Short> values) {
            addCriterion("startYear in", values, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotIn(List<Short> values) {
            addCriterion("startYear not in", values, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearBetween(Short value1, Short value2) {
            addCriterion("startYear between", value1, value2, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotBetween(Short value1, Short value2) {
            addCriterion("startYear not between", value1, value2, "startyear");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("schoolName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("schoolName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("schoolName =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("schoolName <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("schoolName >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolName >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("schoolName <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("schoolName <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("schoolName like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("schoolName not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("schoolName in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("schoolName not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("schoolName between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("schoolName not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelIsNull() {
            addCriterion("schooleLevel is null");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelIsNotNull() {
            addCriterion("schooleLevel is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelEqualTo(Short value) {
            addCriterion("schooleLevel =", value, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelNotEqualTo(Short value) {
            addCriterion("schooleLevel <>", value, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelGreaterThan(Short value) {
            addCriterion("schooleLevel >", value, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelGreaterThanOrEqualTo(Short value) {
            addCriterion("schooleLevel >=", value, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelLessThan(Short value) {
            addCriterion("schooleLevel <", value, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelLessThanOrEqualTo(Short value) {
            addCriterion("schooleLevel <=", value, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelIn(List<Short> values) {
            addCriterion("schooleLevel in", values, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelNotIn(List<Short> values) {
            addCriterion("schooleLevel not in", values, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelBetween(Short value1, Short value2) {
            addCriterion("schooleLevel between", value1, value2, "schoolelevel");
            return (Criteria) this;
        }

        public Criteria andSchoolelevelNotBetween(Short value1, Short value2) {
            addCriterion("schooleLevel not between", value1, value2, "schoolelevel");
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