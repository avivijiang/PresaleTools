package com.yonyou.iuap.project.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Long value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Long value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Long value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Long value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Long value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Long> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Long> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Long value1, Long value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Long value1, Long value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andIsonlysignIsNull() {
            addCriterion("isonlysign is null");
            return (Criteria) this;
        }

        public Criteria andIsonlysignIsNotNull() {
            addCriterion("isonlysign is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlysignEqualTo(String value) {
            addCriterion("isonlysign =", value, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignNotEqualTo(String value) {
            addCriterion("isonlysign <>", value, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignGreaterThan(String value) {
            addCriterion("isonlysign >", value, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignGreaterThanOrEqualTo(String value) {
            addCriterion("isonlysign >=", value, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignLessThan(String value) {
            addCriterion("isonlysign <", value, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignLessThanOrEqualTo(String value) {
            addCriterion("isonlysign <=", value, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignLike(String value) {
            addCriterion("isonlysign like", value, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignNotLike(String value) {
            addCriterion("isonlysign not like", value, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignIn(List<String> values) {
            addCriterion("isonlysign in", values, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignNotIn(List<String> values) {
            addCriterion("isonlysign not in", values, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignBetween(String value1, String value2) {
            addCriterion("isonlysign between", value1, value2, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andIsonlysignNotBetween(String value1, String value2) {
            addCriterion("isonlysign not between", value1, value2, "isonlysign");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryIsNull() {
            addCriterion("onelevel_industry is null");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryIsNotNull() {
            addCriterion("onelevel_industry is not null");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryEqualTo(String value) {
            addCriterion("onelevel_industry =", value, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryNotEqualTo(String value) {
            addCriterion("onelevel_industry <>", value, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryGreaterThan(String value) {
            addCriterion("onelevel_industry >", value, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("onelevel_industry >=", value, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryLessThan(String value) {
            addCriterion("onelevel_industry <", value, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryLessThanOrEqualTo(String value) {
            addCriterion("onelevel_industry <=", value, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryLike(String value) {
            addCriterion("onelevel_industry like", value, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryNotLike(String value) {
            addCriterion("onelevel_industry not like", value, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryIn(List<String> values) {
            addCriterion("onelevel_industry in", values, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryNotIn(List<String> values) {
            addCriterion("onelevel_industry not in", values, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryBetween(String value1, String value2) {
            addCriterion("onelevel_industry between", value1, value2, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andOnelevelIndustryNotBetween(String value1, String value2) {
            addCriterion("onelevel_industry not between", value1, value2, "onelevelIndustry");
            return (Criteria) this;
        }

        public Criteria andIncrementProductIsNull() {
            addCriterion("increment_product is null");
            return (Criteria) this;
        }

        public Criteria andIncrementProductIsNotNull() {
            addCriterion("increment_product is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementProductEqualTo(String value) {
            addCriterion("increment_product =", value, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductNotEqualTo(String value) {
            addCriterion("increment_product <>", value, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductGreaterThan(String value) {
            addCriterion("increment_product >", value, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductGreaterThanOrEqualTo(String value) {
            addCriterion("increment_product >=", value, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductLessThan(String value) {
            addCriterion("increment_product <", value, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductLessThanOrEqualTo(String value) {
            addCriterion("increment_product <=", value, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductLike(String value) {
            addCriterion("increment_product like", value, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductNotLike(String value) {
            addCriterion("increment_product not like", value, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductIn(List<String> values) {
            addCriterion("increment_product in", values, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductNotIn(List<String> values) {
            addCriterion("increment_product not in", values, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductBetween(String value1, String value2) {
            addCriterion("increment_product between", value1, value2, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andIncrementProductNotBetween(String value1, String value2) {
            addCriterion("increment_product not between", value1, value2, "incrementProduct");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsIsNull() {
            addCriterion("project_requirements is null");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsIsNotNull() {
            addCriterion("project_requirements is not null");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsEqualTo(String value) {
            addCriterion("project_requirements =", value, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsNotEqualTo(String value) {
            addCriterion("project_requirements <>", value, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsGreaterThan(String value) {
            addCriterion("project_requirements >", value, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("project_requirements >=", value, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsLessThan(String value) {
            addCriterion("project_requirements <", value, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsLessThanOrEqualTo(String value) {
            addCriterion("project_requirements <=", value, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsLike(String value) {
            addCriterion("project_requirements like", value, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsNotLike(String value) {
            addCriterion("project_requirements not like", value, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsIn(List<String> values) {
            addCriterion("project_requirements in", values, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsNotIn(List<String> values) {
            addCriterion("project_requirements not in", values, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsBetween(String value1, String value2) {
            addCriterion("project_requirements between", value1, value2, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementsNotBetween(String value1, String value2) {
            addCriterion("project_requirements not between", value1, value2, "projectRequirements");
            return (Criteria) this;
        }

        public Criteria andSalesStageIsNull() {
            addCriterion("sales_stage is null");
            return (Criteria) this;
        }

        public Criteria andSalesStageIsNotNull() {
            addCriterion("sales_stage is not null");
            return (Criteria) this;
        }

        public Criteria andSalesStageEqualTo(String value) {
            addCriterion("sales_stage =", value, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageNotEqualTo(String value) {
            addCriterion("sales_stage <>", value, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageGreaterThan(String value) {
            addCriterion("sales_stage >", value, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageGreaterThanOrEqualTo(String value) {
            addCriterion("sales_stage >=", value, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageLessThan(String value) {
            addCriterion("sales_stage <", value, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageLessThanOrEqualTo(String value) {
            addCriterion("sales_stage <=", value, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageLike(String value) {
            addCriterion("sales_stage like", value, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageNotLike(String value) {
            addCriterion("sales_stage not like", value, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageIn(List<String> values) {
            addCriterion("sales_stage in", values, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageNotIn(List<String> values) {
            addCriterion("sales_stage not in", values, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageBetween(String value1, String value2) {
            addCriterion("sales_stage between", value1, value2, "salesStage");
            return (Criteria) this;
        }

        public Criteria andSalesStageNotBetween(String value1, String value2) {
            addCriterion("sales_stage not between", value1, value2, "salesStage");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateIsNull() {
            addCriterion("expected_signdate is null");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateIsNotNull() {
            addCriterion("expected_signdate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateEqualTo(Date value) {
            addCriterionForJDBCDate("expected_signdate =", value, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expected_signdate <>", value, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateGreaterThan(Date value) {
            addCriterionForJDBCDate("expected_signdate >", value, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expected_signdate >=", value, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateLessThan(Date value) {
            addCriterionForJDBCDate("expected_signdate <", value, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expected_signdate <=", value, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateIn(List<Date> values) {
            addCriterionForJDBCDate("expected_signdate in", values, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expected_signdate not in", values, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expected_signdate between", value1, value2, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSigndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expected_signdate not between", value1, value2, "expectedSigndate");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumIsNull() {
            addCriterion("expected_signsum is null");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumIsNotNull() {
            addCriterion("expected_signsum is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumEqualTo(String value) {
            addCriterion("expected_signsum =", value, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumNotEqualTo(String value) {
            addCriterion("expected_signsum <>", value, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumGreaterThan(String value) {
            addCriterion("expected_signsum >", value, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumGreaterThanOrEqualTo(String value) {
            addCriterion("expected_signsum >=", value, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumLessThan(String value) {
            addCriterion("expected_signsum <", value, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumLessThanOrEqualTo(String value) {
            addCriterion("expected_signsum <=", value, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumLike(String value) {
            addCriterion("expected_signsum like", value, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumNotLike(String value) {
            addCriterion("expected_signsum not like", value, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumIn(List<String> values) {
            addCriterion("expected_signsum in", values, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumNotIn(List<String> values) {
            addCriterion("expected_signsum not in", values, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumBetween(String value1, String value2) {
            addCriterion("expected_signsum between", value1, value2, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedSignsumNotBetween(String value1, String value2) {
            addCriterion("expected_signsum not between", value1, value2, "expectedSignsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumIsNull() {
            addCriterion("expected_productsum is null");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumIsNotNull() {
            addCriterion("expected_productsum is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumEqualTo(String value) {
            addCriterion("expected_productsum =", value, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumNotEqualTo(String value) {
            addCriterion("expected_productsum <>", value, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumGreaterThan(String value) {
            addCriterion("expected_productsum >", value, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumGreaterThanOrEqualTo(String value) {
            addCriterion("expected_productsum >=", value, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumLessThan(String value) {
            addCriterion("expected_productsum <", value, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumLessThanOrEqualTo(String value) {
            addCriterion("expected_productsum <=", value, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumLike(String value) {
            addCriterion("expected_productsum like", value, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumNotLike(String value) {
            addCriterion("expected_productsum not like", value, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumIn(List<String> values) {
            addCriterion("expected_productsum in", values, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumNotIn(List<String> values) {
            addCriterion("expected_productsum not in", values, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumBetween(String value1, String value2) {
            addCriterion("expected_productsum between", value1, value2, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andExpectedProductsumNotBetween(String value1, String value2) {
            addCriterion("expected_productsum not between", value1, value2, "expectedProductsum");
            return (Criteria) this;
        }

        public Criteria andProjectRecordIsNull() {
            addCriterion("project_record is null");
            return (Criteria) this;
        }

        public Criteria andProjectRecordIsNotNull() {
            addCriterion("project_record is not null");
            return (Criteria) this;
        }

        public Criteria andProjectRecordEqualTo(String value) {
            addCriterion("project_record =", value, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordNotEqualTo(String value) {
            addCriterion("project_record <>", value, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordGreaterThan(String value) {
            addCriterion("project_record >", value, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordGreaterThanOrEqualTo(String value) {
            addCriterion("project_record >=", value, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordLessThan(String value) {
            addCriterion("project_record <", value, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordLessThanOrEqualTo(String value) {
            addCriterion("project_record <=", value, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordLike(String value) {
            addCriterion("project_record like", value, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordNotLike(String value) {
            addCriterion("project_record not like", value, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordIn(List<String> values) {
            addCriterion("project_record in", values, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordNotIn(List<String> values) {
            addCriterion("project_record not in", values, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordBetween(String value1, String value2) {
            addCriterion("project_record between", value1, value2, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andProjectRecordNotBetween(String value1, String value2) {
            addCriterion("project_record not between", value1, value2, "projectRecord");
            return (Criteria) this;
        }

        public Criteria andNextPlanIsNull() {
            addCriterion("next_plan is null");
            return (Criteria) this;
        }

        public Criteria andNextPlanIsNotNull() {
            addCriterion("next_plan is not null");
            return (Criteria) this;
        }

        public Criteria andNextPlanEqualTo(String value) {
            addCriterion("next_plan =", value, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanNotEqualTo(String value) {
            addCriterion("next_plan <>", value, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanGreaterThan(String value) {
            addCriterion("next_plan >", value, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanGreaterThanOrEqualTo(String value) {
            addCriterion("next_plan >=", value, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanLessThan(String value) {
            addCriterion("next_plan <", value, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanLessThanOrEqualTo(String value) {
            addCriterion("next_plan <=", value, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanLike(String value) {
            addCriterion("next_plan like", value, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanNotLike(String value) {
            addCriterion("next_plan not like", value, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanIn(List<String> values) {
            addCriterion("next_plan in", values, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanNotIn(List<String> values) {
            addCriterion("next_plan not in", values, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanBetween(String value1, String value2) {
            addCriterion("next_plan between", value1, value2, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andNextPlanNotBetween(String value1, String value2) {
            addCriterion("next_plan not between", value1, value2, "nextPlan");
            return (Criteria) this;
        }

        public Criteria andOpponentIsNull() {
            addCriterion("opponent is null");
            return (Criteria) this;
        }

        public Criteria andOpponentIsNotNull() {
            addCriterion("opponent is not null");
            return (Criteria) this;
        }

        public Criteria andOpponentEqualTo(String value) {
            addCriterion("opponent =", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotEqualTo(String value) {
            addCriterion("opponent <>", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentGreaterThan(String value) {
            addCriterion("opponent >", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentGreaterThanOrEqualTo(String value) {
            addCriterion("opponent >=", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLessThan(String value) {
            addCriterion("opponent <", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLessThanOrEqualTo(String value) {
            addCriterion("opponent <=", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLike(String value) {
            addCriterion("opponent like", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotLike(String value) {
            addCriterion("opponent not like", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentIn(List<String> values) {
            addCriterion("opponent in", values, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotIn(List<String> values) {
            addCriterion("opponent not in", values, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentBetween(String value1, String value2) {
            addCriterion("opponent between", value1, value2, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotBetween(String value1, String value2) {
            addCriterion("opponent not between", value1, value2, "opponent");
            return (Criteria) this;
        }

        public Criteria andSalespersonIsNull() {
            addCriterion("salesperson is null");
            return (Criteria) this;
        }

        public Criteria andSalespersonIsNotNull() {
            addCriterion("salesperson is not null");
            return (Criteria) this;
        }

        public Criteria andSalespersonEqualTo(String value) {
            addCriterion("salesperson =", value, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonNotEqualTo(String value) {
            addCriterion("salesperson <>", value, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonGreaterThan(String value) {
            addCriterion("salesperson >", value, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonGreaterThanOrEqualTo(String value) {
            addCriterion("salesperson >=", value, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonLessThan(String value) {
            addCriterion("salesperson <", value, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonLessThanOrEqualTo(String value) {
            addCriterion("salesperson <=", value, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonLike(String value) {
            addCriterion("salesperson like", value, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonNotLike(String value) {
            addCriterion("salesperson not like", value, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonIn(List<String> values) {
            addCriterion("salesperson in", values, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonNotIn(List<String> values) {
            addCriterion("salesperson not in", values, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonBetween(String value1, String value2) {
            addCriterion("salesperson between", value1, value2, "salesperson");
            return (Criteria) this;
        }

        public Criteria andSalespersonNotBetween(String value1, String value2) {
            addCriterion("salesperson not between", value1, value2, "salesperson");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersIsNull() {
            addCriterion("presale_headquarters is null");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersIsNotNull() {
            addCriterion("presale_headquarters is not null");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersEqualTo(String value) {
            addCriterion("presale_headquarters =", value, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersNotEqualTo(String value) {
            addCriterion("presale_headquarters <>", value, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersGreaterThan(String value) {
            addCriterion("presale_headquarters >", value, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersGreaterThanOrEqualTo(String value) {
            addCriterion("presale_headquarters >=", value, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersLessThan(String value) {
            addCriterion("presale_headquarters <", value, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersLessThanOrEqualTo(String value) {
            addCriterion("presale_headquarters <=", value, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersLike(String value) {
            addCriterion("presale_headquarters like", value, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersNotLike(String value) {
            addCriterion("presale_headquarters not like", value, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersIn(List<String> values) {
            addCriterion("presale_headquarters in", values, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersNotIn(List<String> values) {
            addCriterion("presale_headquarters not in", values, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersBetween(String value1, String value2) {
            addCriterion("presale_headquarters between", value1, value2, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andPresaleHeadquartersNotBetween(String value1, String value2) {
            addCriterion("presale_headquarters not between", value1, value2, "presaleHeadquarters");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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