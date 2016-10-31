package com.yonyou.iuap.business.dto;

import java.util.Date;

public class ProjectInfoDto {

	
	//项目id
	private long projectId;
	//项目名
	private String projectName;
	//是否独签
	private String isSingle;
	//一级行业
	private String onelevelProfession;
	//平台增值产品
	private String valueaddProduct;
	//项目需求
	private String projectRequirement;
	//销售阶段
	private String salesStage;
	//预计签约时间
	private Date estimatedTime;
	//预计签约金额
	private String estimatedAmount;
	//预计产品金额
	private String productAmount;
	//主要竞争对手
	private String competitor;
	//销售人员
	private String 	salesMan;
	//总部售前
	private String headSale;
	//备注
	private String remarks;
	//分公司
	private String branchName;
	//大区
	private String regionName;
	
	
	
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
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
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	
}
