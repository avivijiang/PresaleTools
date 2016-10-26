package com.yonyou.iuap.business.entity;

public class BranchCompany {
    private Long branchId;

    private String branchName;

    private String branchDescription;

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public String getBranchDescription() {
        return branchDescription;
    }

    public void setBranchDescription(String branchDescription) {
        this.branchDescription = branchDescription == null ? null : branchDescription.trim();
    }
}