package com.ytd.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserJxMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserJxMainExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUseridnoIsNull() {
            addCriterion("userIdno is null");
            return (Criteria) this;
        }

        public Criteria andUseridnoIsNotNull() {
            addCriterion("userIdno is not null");
            return (Criteria) this;
        }

        public Criteria andUseridnoEqualTo(String value) {
            addCriterion("userIdno =", value, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoNotEqualTo(String value) {
            addCriterion("userIdno <>", value, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoGreaterThan(String value) {
            addCriterion("userIdno >", value, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoGreaterThanOrEqualTo(String value) {
            addCriterion("userIdno >=", value, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoLessThan(String value) {
            addCriterion("userIdno <", value, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoLessThanOrEqualTo(String value) {
            addCriterion("userIdno <=", value, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoLike(String value) {
            addCriterion("userIdno like", value, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoNotLike(String value) {
            addCriterion("userIdno not like", value, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoIn(List<String> values) {
            addCriterion("userIdno in", values, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoNotIn(List<String> values) {
            addCriterion("userIdno not in", values, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoBetween(String value1, String value2) {
            addCriterion("userIdno between", value1, value2, "useridno");
            return (Criteria) this;
        }

        public Criteria andUseridnoNotBetween(String value1, String value2) {
            addCriterion("userIdno not between", value1, value2, "useridno");
            return (Criteria) this;
        }

        public Criteria andUsermobileIsNull() {
            addCriterion("userMobile is null");
            return (Criteria) this;
        }

        public Criteria andUsermobileIsNotNull() {
            addCriterion("userMobile is not null");
            return (Criteria) this;
        }

        public Criteria andUsermobileEqualTo(String value) {
            addCriterion("userMobile =", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileNotEqualTo(String value) {
            addCriterion("userMobile <>", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileGreaterThan(String value) {
            addCriterion("userMobile >", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileGreaterThanOrEqualTo(String value) {
            addCriterion("userMobile >=", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileLessThan(String value) {
            addCriterion("userMobile <", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileLessThanOrEqualTo(String value) {
            addCriterion("userMobile <=", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileLike(String value) {
            addCriterion("userMobile like", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileNotLike(String value) {
            addCriterion("userMobile not like", value, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileIn(List<String> values) {
            addCriterion("userMobile in", values, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileNotIn(List<String> values) {
            addCriterion("userMobile not in", values, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileBetween(String value1, String value2) {
            addCriterion("userMobile between", value1, value2, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsermobileNotBetween(String value1, String value2) {
            addCriterion("userMobile not between", value1, value2, "usermobile");
            return (Criteria) this;
        }

        public Criteria andUsercardnoIsNull() {
            addCriterion("userCardNo is null");
            return (Criteria) this;
        }

        public Criteria andUsercardnoIsNotNull() {
            addCriterion("userCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardnoEqualTo(String value) {
            addCriterion("userCardNo =", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoNotEqualTo(String value) {
            addCriterion("userCardNo <>", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoGreaterThan(String value) {
            addCriterion("userCardNo >", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoGreaterThanOrEqualTo(String value) {
            addCriterion("userCardNo >=", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoLessThan(String value) {
            addCriterion("userCardNo <", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoLessThanOrEqualTo(String value) {
            addCriterion("userCardNo <=", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoLike(String value) {
            addCriterion("userCardNo like", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoNotLike(String value) {
            addCriterion("userCardNo not like", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoIn(List<String> values) {
            addCriterion("userCardNo in", values, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoNotIn(List<String> values) {
            addCriterion("userCardNo not in", values, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoBetween(String value1, String value2) {
            addCriterion("userCardNo between", value1, value2, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoNotBetween(String value1, String value2) {
            addCriterion("userCardNo not between", value1, value2, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUseraccountidIsNull() {
            addCriterion("userAccountId is null");
            return (Criteria) this;
        }

        public Criteria andUseraccountidIsNotNull() {
            addCriterion("userAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccountidEqualTo(String value) {
            addCriterion("userAccountId =", value, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidNotEqualTo(String value) {
            addCriterion("userAccountId <>", value, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidGreaterThan(String value) {
            addCriterion("userAccountId >", value, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidGreaterThanOrEqualTo(String value) {
            addCriterion("userAccountId >=", value, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidLessThan(String value) {
            addCriterion("userAccountId <", value, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidLessThanOrEqualTo(String value) {
            addCriterion("userAccountId <=", value, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidLike(String value) {
            addCriterion("userAccountId like", value, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidNotLike(String value) {
            addCriterion("userAccountId not like", value, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidIn(List<String> values) {
            addCriterion("userAccountId in", values, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidNotIn(List<String> values) {
            addCriterion("userAccountId not in", values, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidBetween(String value1, String value2) {
            addCriterion("userAccountId between", value1, value2, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andUseraccountidNotBetween(String value1, String value2) {
            addCriterion("userAccountId not between", value1, value2, "useraccountid");
            return (Criteria) this;
        }

        public Criteria andAcqresIsNull() {
            addCriterion("acqRes is null");
            return (Criteria) this;
        }

        public Criteria andAcqresIsNotNull() {
            addCriterion("acqRes is not null");
            return (Criteria) this;
        }

        public Criteria andAcqresEqualTo(String value) {
            addCriterion("acqRes =", value, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresNotEqualTo(String value) {
            addCriterion("acqRes <>", value, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresGreaterThan(String value) {
            addCriterion("acqRes >", value, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresGreaterThanOrEqualTo(String value) {
            addCriterion("acqRes >=", value, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresLessThan(String value) {
            addCriterion("acqRes <", value, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresLessThanOrEqualTo(String value) {
            addCriterion("acqRes <=", value, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresLike(String value) {
            addCriterion("acqRes like", value, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresNotLike(String value) {
            addCriterion("acqRes not like", value, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresIn(List<String> values) {
            addCriterion("acqRes in", values, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresNotIn(List<String> values) {
            addCriterion("acqRes not in", values, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresBetween(String value1, String value2) {
            addCriterion("acqRes between", value1, value2, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqresNotBetween(String value1, String value2) {
            addCriterion("acqRes not between", value1, value2, "acqres");
            return (Criteria) this;
        }

        public Criteria andAcqres1IsNull() {
            addCriterion("acqRes1 is null");
            return (Criteria) this;
        }

        public Criteria andAcqres1IsNotNull() {
            addCriterion("acqRes1 is not null");
            return (Criteria) this;
        }

        public Criteria andAcqres1EqualTo(String value) {
            addCriterion("acqRes1 =", value, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1NotEqualTo(String value) {
            addCriterion("acqRes1 <>", value, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1GreaterThan(String value) {
            addCriterion("acqRes1 >", value, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1GreaterThanOrEqualTo(String value) {
            addCriterion("acqRes1 >=", value, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1LessThan(String value) {
            addCriterion("acqRes1 <", value, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1LessThanOrEqualTo(String value) {
            addCriterion("acqRes1 <=", value, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1Like(String value) {
            addCriterion("acqRes1 like", value, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1NotLike(String value) {
            addCriterion("acqRes1 not like", value, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1In(List<String> values) {
            addCriterion("acqRes1 in", values, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1NotIn(List<String> values) {
            addCriterion("acqRes1 not in", values, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1Between(String value1, String value2) {
            addCriterion("acqRes1 between", value1, value2, "acqres1");
            return (Criteria) this;
        }

        public Criteria andAcqres1NotBetween(String value1, String value2) {
            addCriterion("acqRes1 not between", value1, value2, "acqres1");
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