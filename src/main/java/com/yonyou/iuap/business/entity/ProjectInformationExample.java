package com.yonyou.iuap.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectInformationExample() {
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

        public Criteria andIsSingleIsNull() {
            addCriterion("is_single is null");
            return (Criteria) this;
        }

        public Criteria andIsSingleIsNotNull() {
            addCriterion("is_single is not null");
            return (Criteria) this;
        }

        public Criteria andIsSingleEqualTo(String value) {
            addCriterion("is_single =", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotEqualTo(String value) {
            addCriterion("is_single <>", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleGreaterThan(String value) {
            addCriterion("is_single >", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleGreaterThanOrEqualTo(String value) {
            addCriterion("is_single >=", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleLessThan(String value) {
            addCriterion("is_single <", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleLessThanOrEqualTo(String value) {
            addCriterion("is_single <=", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleLike(String value) {
            addCriterion("is_single like", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotLike(String value) {
            addCriterion("is_single not like", value, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleIn(List<String> values) {
            addCriterion("is_single in", values, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotIn(List<String> values) {
            addCriterion("is_single not in", values, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleBetween(String value1, String value2) {
            addCriterion("is_single between", value1, value2, "isSingle");
            return (Criteria) this;
        }

        public Criteria andIsSingleNotBetween(String value1, String value2) {
            addCriterion("is_single not between", value1, value2, "isSingle");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionIsNull() {
            addCriterion("onelevel_profession is null");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionIsNotNull() {
            addCriterion("onelevel_profession is not null");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionEqualTo(String value) {
            addCriterion("onelevel_profession =", value, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionNotEqualTo(String value) {
            addCriterion("onelevel_profession <>", value, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionGreaterThan(String value) {
            addCriterion("onelevel_profession >", value, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("onelevel_profession >=", value, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionLessThan(String value) {
            addCriterion("onelevel_profession <", value, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionLessThanOrEqualTo(String value) {
            addCriterion("onelevel_profession <=", value, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionLike(String value) {
            addCriterion("onelevel_profession like", value, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionNotLike(String value) {
            addCriterion("onelevel_profession not like", value, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionIn(List<String> values) {
            addCriterion("onelevel_profession in", values, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionNotIn(List<String> values) {
            addCriterion("onelevel_profession not in", values, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionBetween(String value1, String value2) {
            addCriterion("onelevel_profession between", value1, value2, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andOnelevelProfessionNotBetween(String value1, String value2) {
            addCriterion("onelevel_profession not between", value1, value2, "onelevelProfession");
            return (Criteria) this;
        }

        public Criteria andValueaddProductIsNull() {
            addCriterion("valueadd_product is null");
            return (Criteria) this;
        }

        public Criteria andValueaddProductIsNotNull() {
            addCriterion("valueadd_product is not null");
            return (Criteria) this;
        }

        public Criteria andValueaddProductEqualTo(String value) {
            addCriterion("valueadd_product =", value, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductNotEqualTo(String value) {
            addCriterion("valueadd_product <>", value, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductGreaterThan(String value) {
            addCriterion("valueadd_product >", value, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductGreaterThanOrEqualTo(String value) {
            addCriterion("valueadd_product >=", value, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductLessThan(String value) {
            addCriterion("valueadd_product <", value, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductLessThanOrEqualTo(String value) {
            addCriterion("valueadd_product <=", value, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductLike(String value) {
            addCriterion("valueadd_product like", value, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductNotLike(String value) {
            addCriterion("valueadd_product not like", value, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductIn(List<String> values) {
            addCriterion("valueadd_product in", values, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductNotIn(List<String> values) {
            addCriterion("valueadd_product not in", values, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductBetween(String value1, String value2) {
            addCriterion("valueadd_product between", value1, value2, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andValueaddProductNotBetween(String value1, String value2) {
            addCriterion("valueadd_product not between", value1, value2, "valueaddProduct");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementIsNull() {
            addCriterion("project_requirement is null");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementIsNotNull() {
            addCriterion("project_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementEqualTo(String value) {
            addCriterion("project_requirement =", value, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementNotEqualTo(String value) {
            addCriterion("project_requirement <>", value, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementGreaterThan(String value) {
            addCriterion("project_requirement >", value, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("project_requirement >=", value, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementLessThan(String value) {
            addCriterion("project_requirement <", value, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementLessThanOrEqualTo(String value) {
            addCriterion("project_requirement <=", value, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementLike(String value) {
            addCriterion("project_requirement like", value, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementNotLike(String value) {
            addCriterion("project_requirement not like", value, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementIn(List<String> values) {
            addCriterion("project_requirement in", values, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementNotIn(List<String> values) {
            addCriterion("project_requirement not in", values, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementBetween(String value1, String value2) {
            addCriterion("project_requirement between", value1, value2, "projectRequirement");
            return (Criteria) this;
        }

        public Criteria andProjectRequirementNotBetween(String value1, String value2) {
            addCriterion("project_requirement not between", value1, value2, "projectRequirement");
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

        public Criteria andEstimatedTimeIsNull() {
            addCriterion("estimated_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeIsNotNull() {
            addCriterion("estimated_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeEqualTo(Date value) {
            addCriterion("estimated_time =", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotEqualTo(Date value) {
            addCriterion("estimated_time <>", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeGreaterThan(Date value) {
            addCriterion("estimated_time >", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("estimated_time >=", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeLessThan(Date value) {
            addCriterion("estimated_time <", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("estimated_time <=", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeIn(List<Date> values) {
            addCriterion("estimated_time in", values, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotIn(List<Date> values) {
            addCriterion("estimated_time not in", values, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeBetween(Date value1, Date value2) {
            addCriterion("estimated_time between", value1, value2, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("estimated_time not between", value1, value2, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIsNull() {
            addCriterion("estimated_amount is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIsNotNull() {
            addCriterion("estimated_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountEqualTo(String value) {
            addCriterion("estimated_amount =", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotEqualTo(String value) {
            addCriterion("estimated_amount <>", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountGreaterThan(String value) {
            addCriterion("estimated_amount >", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountGreaterThanOrEqualTo(String value) {
            addCriterion("estimated_amount >=", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLessThan(String value) {
            addCriterion("estimated_amount <", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLessThanOrEqualTo(String value) {
            addCriterion("estimated_amount <=", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLike(String value) {
            addCriterion("estimated_amount like", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotLike(String value) {
            addCriterion("estimated_amount not like", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIn(List<String> values) {
            addCriterion("estimated_amount in", values, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotIn(List<String> values) {
            addCriterion("estimated_amount not in", values, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountBetween(String value1, String value2) {
            addCriterion("estimated_amount between", value1, value2, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotBetween(String value1, String value2) {
            addCriterion("estimated_amount not between", value1, value2, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNull() {
            addCriterion("product_amount is null");
            return (Criteria) this;
        }

        public Criteria andProductAmountIsNotNull() {
            addCriterion("product_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProductAmountEqualTo(String value) {
            addCriterion("product_amount =", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotEqualTo(String value) {
            addCriterion("product_amount <>", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThan(String value) {
            addCriterion("product_amount >", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountGreaterThanOrEqualTo(String value) {
            addCriterion("product_amount >=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThan(String value) {
            addCriterion("product_amount <", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLessThanOrEqualTo(String value) {
            addCriterion("product_amount <=", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountLike(String value) {
            addCriterion("product_amount like", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotLike(String value) {
            addCriterion("product_amount not like", value, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountIn(List<String> values) {
            addCriterion("product_amount in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotIn(List<String> values) {
            addCriterion("product_amount not in", values, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountBetween(String value1, String value2) {
            addCriterion("product_amount between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andProductAmountNotBetween(String value1, String value2) {
            addCriterion("product_amount not between", value1, value2, "productAmount");
            return (Criteria) this;
        }

        public Criteria andCompetitorIsNull() {
            addCriterion("competitor is null");
            return (Criteria) this;
        }

        public Criteria andCompetitorIsNotNull() {
            addCriterion("competitor is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitorEqualTo(String value) {
            addCriterion("competitor =", value, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorNotEqualTo(String value) {
            addCriterion("competitor <>", value, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorGreaterThan(String value) {
            addCriterion("competitor >", value, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorGreaterThanOrEqualTo(String value) {
            addCriterion("competitor >=", value, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorLessThan(String value) {
            addCriterion("competitor <", value, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorLessThanOrEqualTo(String value) {
            addCriterion("competitor <=", value, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorLike(String value) {
            addCriterion("competitor like", value, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorNotLike(String value) {
            addCriterion("competitor not like", value, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorIn(List<String> values) {
            addCriterion("competitor in", values, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorNotIn(List<String> values) {
            addCriterion("competitor not in", values, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorBetween(String value1, String value2) {
            addCriterion("competitor between", value1, value2, "competitor");
            return (Criteria) this;
        }

        public Criteria andCompetitorNotBetween(String value1, String value2) {
            addCriterion("competitor not between", value1, value2, "competitor");
            return (Criteria) this;
        }

        public Criteria andSalesManIsNull() {
            addCriterion("sales_man is null");
            return (Criteria) this;
        }

        public Criteria andSalesManIsNotNull() {
            addCriterion("sales_man is not null");
            return (Criteria) this;
        }

        public Criteria andSalesManEqualTo(String value) {
            addCriterion("sales_man =", value, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManNotEqualTo(String value) {
            addCriterion("sales_man <>", value, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManGreaterThan(String value) {
            addCriterion("sales_man >", value, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManGreaterThanOrEqualTo(String value) {
            addCriterion("sales_man >=", value, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManLessThan(String value) {
            addCriterion("sales_man <", value, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManLessThanOrEqualTo(String value) {
            addCriterion("sales_man <=", value, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManLike(String value) {
            addCriterion("sales_man like", value, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManNotLike(String value) {
            addCriterion("sales_man not like", value, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManIn(List<String> values) {
            addCriterion("sales_man in", values, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManNotIn(List<String> values) {
            addCriterion("sales_man not in", values, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManBetween(String value1, String value2) {
            addCriterion("sales_man between", value1, value2, "salesMan");
            return (Criteria) this;
        }

        public Criteria andSalesManNotBetween(String value1, String value2) {
            addCriterion("sales_man not between", value1, value2, "salesMan");
            return (Criteria) this;
        }

        public Criteria andHeadSaleIsNull() {
            addCriterion("head_sale is null");
            return (Criteria) this;
        }

        public Criteria andHeadSaleIsNotNull() {
            addCriterion("head_sale is not null");
            return (Criteria) this;
        }

        public Criteria andHeadSaleEqualTo(String value) {
            addCriterion("head_sale =", value, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleNotEqualTo(String value) {
            addCriterion("head_sale <>", value, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleGreaterThan(String value) {
            addCriterion("head_sale >", value, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleGreaterThanOrEqualTo(String value) {
            addCriterion("head_sale >=", value, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleLessThan(String value) {
            addCriterion("head_sale <", value, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleLessThanOrEqualTo(String value) {
            addCriterion("head_sale <=", value, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleLike(String value) {
            addCriterion("head_sale like", value, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleNotLike(String value) {
            addCriterion("head_sale not like", value, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleIn(List<String> values) {
            addCriterion("head_sale in", values, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleNotIn(List<String> values) {
            addCriterion("head_sale not in", values, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleBetween(String value1, String value2) {
            addCriterion("head_sale between", value1, value2, "headSale");
            return (Criteria) this;
        }

        public Criteria andHeadSaleNotBetween(String value1, String value2) {
            addCriterion("head_sale not between", value1, value2, "headSale");
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