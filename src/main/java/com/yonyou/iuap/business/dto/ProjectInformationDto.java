package com.yonyou.iuap.business.dto;

import java.util.Date;

public class ProjectInformationDto {

    private Long projectId;//主键

    private String projectName;//项目名称

    private String isSingle;//是否独签

    private String onelevelProfession;//一级行业

    private String valueaddProduct;//平台增值产品

    private String projectRequirement;//项目具体需求

    private String salesStage;//销售阶段

    private Date estimatedTime;//预计签约时间

    private String estimatedAmount;//预计签约金额

    private String productAmount;//预计产品金额

    private String competitor;//主要竞争对手

    private String salesMan;//销售

    private String headSale;//总部售前

    private String remarks;//备注
    
    private Long branchId;//分公司主键
    
    private Long customerId;//客户主键

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getIsSingle() {
		return isSingle;
	}

	public void setIsSingle(String isSingle) {
		this.isSingle = isSingle;
	}

	public String getOnelevelProfession() {
		return onelevelProfession;
	}

	public void setOnelevelProfession(String onelevelProfession) {
		this.onelevelProfession = onelevelProfession;
	}

	public String getValueaddProduct() {
		return valueaddProduct;
	}

	public void setValueaddProduct(String valueaddProduct) {
		this.valueaddProduct = valueaddProduct;
	}

	public String getProjectRequirement() {
		return projectRequirement;
	}

	public void setProjectRequirement(String projectRequirement) {
		this.projectRequirement = projectRequirement;
	}

	public String getSalesStage() {
		return salesStage;
	}

	public void setSalesStage(String salesStage) {
		this.salesStage = salesStage;
	}

	public Date getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(Date estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public String getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(String estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	public String getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(String productAmount) {
		this.productAmount = productAmount;
	}

	public String getCompetitor() {
		return competitor;
	}

	public void setCompetitor(String competitor) {
		this.competitor = competitor;
	}

	public String getSalesMan() {
		return salesMan;
	}

	public void setSalesMan(String salesMan) {
		this.salesMan = salesMan;
	}

	public String getHeadSale() {
		return headSale;
	}

	public void setHeadSale(String headSale) {
		this.headSale = headSale;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
    
	
}
