package com.yonyou.iuap.business.dto;

public class ProjectFollowRecordDto {

	private Long projectId;//项目主键
	
	private String salesStage;//项目阶段
	
	private String record;//记录
	
	private String nextStep;//下一步计划

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getSalesStage() {
		return salesStage;
	}

	public void setSalesStage(String salesStage) {
		this.salesStage = salesStage;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getNextStep() {
		return nextStep;
	}

	public void setNextStep(String nextStep) {
		this.nextStep = nextStep;
	}
	
	
	
}
