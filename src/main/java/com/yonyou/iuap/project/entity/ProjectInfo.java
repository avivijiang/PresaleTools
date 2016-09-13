package com.yonyou.iuap.project.entity;

import java.util.Date;

import com.yonyou.iuap.customer.entity.SalesCustomers;

public class ProjectInfo {
    private Long projectId;

    private String projectName;

    private Long clientId;

    private String userName;

    private String isonlysign;

    private String onelevelIndustry;

    private String incrementProduct;

    private String projectRequirements;

    private String salesStage;

    private Date expectedSigndate;

    private String expectedSignsum;

    private String expectedProductsum;

    private String projectRecord;

    private String nextPlan;

    private String opponent;

    private String salesperson;

    private String presaleHeadquarters;

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

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getIsonlysign() {
        return isonlysign;
    }

    public void setIsonlysign(String isonlysign) {
        this.isonlysign = isonlysign == null ? null : isonlysign.trim();
    }

    public String getOnelevelIndustry() {
        return onelevelIndustry;
    }

    public void setOnelevelIndustry(String onelevelIndustry) {
        this.onelevelIndustry = onelevelIndustry == null ? null : onelevelIndustry.trim();
    }

    public String getIncrementProduct() {
        return incrementProduct;
    }

    public void setIncrementProduct(String incrementProduct) {
        this.incrementProduct = incrementProduct == null ? null : incrementProduct.trim();
    }

    public String getProjectRequirements() {
        return projectRequirements;
    }

    public void setProjectRequirements(String projectRequirements) {
        this.projectRequirements = projectRequirements == null ? null : projectRequirements.trim();
    }

    public String getSalesStage() {
        return salesStage;
    }

    public void setSalesStage(String salesStage) {
        this.salesStage = salesStage == null ? null : salesStage.trim();
    }

    public Date getExpectedSigndate() {
        return expectedSigndate;
    }

    public void setExpectedSigndate(Date expectedSigndate) {
        this.expectedSigndate = expectedSigndate;
    }

    public String getExpectedSignsum() {
        return expectedSignsum;
    }

    public void setExpectedSignsum(String expectedSignsum) {
        this.expectedSignsum = expectedSignsum == null ? null : expectedSignsum.trim();
    }

    public String getExpectedProductsum() {
        return expectedProductsum;
    }

    public void setExpectedProductsum(String expectedProductsum) {
        this.expectedProductsum = expectedProductsum == null ? null : expectedProductsum.trim();
    }

    public String getProjectRecord() {
        return projectRecord;
    }

    public void setProjectRecord(String projectRecord) {
        this.projectRecord = projectRecord == null ? null : projectRecord.trim();
    }

    public String getNextPlan() {
        return nextPlan;
    }

    public void setNextPlan(String nextPlan) {
        this.nextPlan = nextPlan == null ? null : nextPlan.trim();
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent == null ? null : opponent.trim();
    }

    public String getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(String salesperson) {
        this.salesperson = salesperson == null ? null : salesperson.trim();
    }

    public String getPresaleHeadquarters() {
        return presaleHeadquarters;
    }

    public void setPresaleHeadquarters(String presaleHeadquarters) {
        this.presaleHeadquarters = presaleHeadquarters == null ? null : presaleHeadquarters.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

}