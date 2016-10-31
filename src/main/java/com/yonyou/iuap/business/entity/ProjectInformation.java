package com.yonyou.iuap.business.entity;

import java.util.Date;

public class ProjectInformation {
    private Long projectId;

    private String projectName;

    private String isSingle;

    private String onelevelProfession;

    private String valueaddProduct;

    private String projectRequirement;

    private String salesStage;

    private Date estimatedTime;

    private String estimatedAmount;

    private String productAmount;

    private String competitor;

    private String salesMan;

    private String headSale;

    private String remarks;

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
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getIsSingle() {
        return isSingle;
    }

    public void setIsSingle(String isSingle) {
        this.isSingle = isSingle == null ? null : isSingle.trim();
    }

    public String getOnelevelProfession() {
        return onelevelProfession;
    }

    public void setOnelevelProfession(String onelevelProfession) {
        this.onelevelProfession = onelevelProfession == null ? null : onelevelProfession.trim();
    }

    public String getValueaddProduct() {
        return valueaddProduct;
    }

    public void setValueaddProduct(String valueaddProduct) {
        this.valueaddProduct = valueaddProduct == null ? null : valueaddProduct.trim();
    }

    public String getProjectRequirement() {
        return projectRequirement;
    }

    public void setProjectRequirement(String projectRequirement) {
        this.projectRequirement = projectRequirement == null ? null : projectRequirement.trim();
    }

    public String getSalesStage() {
        return salesStage;
    }

    public void setSalesStage(String salesStage) {
        this.salesStage = salesStage == null ? null : salesStage.trim();
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
        this.estimatedAmount = estimatedAmount == null ? null : estimatedAmount.trim();
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount == null ? null : productAmount.trim();
    }

    public String getCompetitor() {
        return competitor;
    }

    public void setCompetitor(String competitor) {
        this.competitor = competitor == null ? null : competitor.trim();
    }

    public String getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(String salesMan) {
        this.salesMan = salesMan == null ? null : salesMan.trim();
    }

    public String getHeadSale() {
        return headSale;
    }

    public void setHeadSale(String headSale) {
        this.headSale = headSale == null ? null : headSale.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}